import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node root;
    public Tree() {
    }


    public void add(int val) {
        Node z = new Node(val);
        if (root == null) {
            root = z;
            return;
        }

        Node parent = null, x = root;
        while (x != null) {
            parent = x;
            if (val < x.value) {
                x = x.left;
            } else if (val > x.value) {
                x = x.right;
            } else {
                return;
            }
        }
        if(val < parent.value){
            parent.left = z;
        } else {
            parent.right = z;
        }
    }


    public boolean contains(int value){
        Node x = root;
        while (x!=null){
            if(value < x.value)
                x = x.left;
            else if(value > x.value)
                x = x.right;
            else return true;
        }
        return false;
    }


    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }



    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }



    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }


    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right!= null) {
                nodes.add(node.right);
            }
        }
    }


    public void printElements(String order){
        switch (order){
            default:traverseLevelOrder();
                break;
            case "in":traverseInOrder(root);
                break;
            case "pre":traversePreOrder(root);
                break;
            case "post":traversePostOrder(root);
                break;
        }
    }

    class Node {
        int value;
        Node left;
        Node right;


        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

}
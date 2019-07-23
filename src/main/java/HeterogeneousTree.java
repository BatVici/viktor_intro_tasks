public class HeterogeneousTree {
    private HTreeElement parentNode;
    private HTreeElement head;
    private boolean headFull = false;
    private int elemCount;


    public HeterogeneousTree(){
        this.parentNode = new HTreeElement(null, ++elemCount);
        head = parentNode;
    }


    private HTreeElement findHead(HTreeElement node){

        if(!node.isFull){
            return node;
        }

        if(!node.left.isFull){
            return node.left;
        }
        if (!node.right.isFull){
            return node.right;
        }
        return node;
    }


    public void add(Object object){

        if(parentNode.node == null){
            parentNode.node = object;
            return;
        }

        if(!headFull){
            headFull = head.addElement(object, ++elemCount);
        }
        else {
            head = findHead(parentNode);
            head.addElement(object, ++elemCount);
            headFull = false;
        }
    }


    private void preOrder(HTreeElement node){

        if(node == null){
            return;
        }

        System.out.println(node.node.getClass().getSimpleName() + " " + node.index);

        preOrder(node.left);
        preOrder(node.right);

    }


    private void inOrder(HTreeElement node){

        if(node == null){
            return;
        }

        inOrder(node.left);

        System.out.println(node.node.getClass().getSimpleName() + " " + node.index);

        inOrder(node.right);


    }


    private void postOrder(HTreeElement node){

        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);

        System.out.println(node.node.getClass().getSimpleName() + " " + node.index);

    }


    public void printElements(String order){

        if(order.equals("pre-order")){
            preOrder(parentNode);
        }
        else if(order.equals("in-order")){
            inOrder(parentNode);
        }
        else if(order.equals("post-order")){

            postOrder(parentNode);

        }
    }

}
public class Program {

    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.add(6);
        tree.add(3);
        System.out.println(tree.contains(9));
        tree.add(9);
        tree.add(2);
        tree.add(7);
        System.out.println(tree.contains(9));
        tree.printElements("post");
    }

}

public class Program {

    public static void main(String[] args)
    {
        int[] array = {1,3,5,7,9};
        ArrayOperations operations=new ArrayOperations();
        int i = operations.getMinElement(array);
        System.out.println(i);
        int j = operations.getSum(array);
        System.out.println(j);
        operations.printArray(array);
    }

}

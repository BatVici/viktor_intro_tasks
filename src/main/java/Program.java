public class Program {

    public static void main(String[] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort op = new QuickSort();
        op.quickSort(arr, 0, n-1);

        System.out.println("sorted array");
        op.printArray(arr);
    }

}

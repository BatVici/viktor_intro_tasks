public class ArrayOperations {


    public int getMinElement(int[] array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }



    public int getSum(int[] array){
        int sum = 0;
        for (int num: array) {
            sum += num;
        }
        return sum;
    }



    void printArray(int[] array){
        for (int num:array) {
            System.out.print(num+" ");
        }
    }
}


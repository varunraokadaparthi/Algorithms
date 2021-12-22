package sort;

public class BubbleSort {
    public static int[] sort(int[] arr){
        int i,j,temp;
        for (i = 0; i < arr.length; i++) {
            for (j = 1; j < arr.length ; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

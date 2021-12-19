package sort;

public class InsertionSort {
    public static int[] sort(int []arr) {
        int i,j,key;
        for(i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while ( j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}

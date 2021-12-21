package sort;

public class InsertionSort {

    /**
     * Ascending Sort
     * @param arr - input array to be sorted
     * @param ascending - order of sorting
     * @return sorted array
     */
    public static int[] sort(int []arr, boolean ascending) {
        int i,j,key;
        // sort in ascending order
        if (ascending) {
            for (i = 1; i < arr.length; i++) {
                key = arr[i];
                j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
        // sort in descending order
        else {
            for (i = arr.length-2; i >= 0; i--) {
                key = arr[i];
                j = i + 1;
                while (j < arr.length && key < arr[j]) {
                    arr[j-1] = arr[j];
                    j++;
                }
                arr[j-1] = key;
            }
        }
        return arr;
    }
}

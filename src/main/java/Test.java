import sort.BubbleSort;
import sort.InsertionSort;

public class Test {
    public static void main(String[] args) {
        int[] arr = InsertionSort.sort(new int[]{5, 10, 7, 7, 23}, false);
//        int[] arr = BubbleSort.sort(new int[]{5, 10, 7, 7, 23});
        for (int num: arr) {
            System.out.println(num);
        }
    }
}

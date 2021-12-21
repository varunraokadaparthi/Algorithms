import sort.InsertionSort;

public class Test {
    public static void main(String[] args) {
        int[] arr = InsertionSort.sort(new int[]{5, 10, 25, 7, 23}, false);
        for (int num: arr) {
            System.out.println(num);
        }
    }
}

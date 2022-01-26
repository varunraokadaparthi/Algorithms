package search;

public class BinarySearch {
    public static int search(int[] nums, int target){
        return search(nums, 0, nums.length-1, target);
        
    }

    private static int search(int[] nums, int lowIndex, int highIndex, int target) {
        int partition = (highIndex + lowIndex)/2;
        if(highIndex < lowIndex){
            return -1;
        }

        if(nums[partition] == target) {
            return partition;        
        }
           
        if (nums[partition] > target) {
            return search(nums, lowIndex, partition - 1, target);
        } else {
            return search(nums, partition + 1, highIndex, target);
        }
    }
}

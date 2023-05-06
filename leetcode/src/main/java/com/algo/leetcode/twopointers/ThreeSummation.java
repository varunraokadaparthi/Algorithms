package com.algo.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/3sum/
 * 15. 3Sum
 */
public class ThreeSummation {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    int leftPointer;
    int rightPointer;
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (i != 0 && nums[i - 1] == nums[i]) {
        continue;
      }
      leftPointer = i + 1;
      rightPointer = nums.length - 1;
      while (leftPointer < rightPointer) {
        if (rightPointer > leftPointer
                && nums[leftPointer] + nums[rightPointer] > -nums[i]) {
          rightPointer--;
        } else if (leftPointer < rightPointer
                && nums[leftPointer] + nums[rightPointer] < -nums[i]) {
          leftPointer++;
        } else {
          result.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
          leftPointer++;
          while(leftPointer < rightPointer && nums[leftPointer - 1] == nums[leftPointer]) {
            leftPointer++;
          }
        }

      }
    }
    return result;
  }
}

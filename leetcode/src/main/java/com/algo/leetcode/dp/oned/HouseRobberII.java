package com.algo.leetcode.dp.oned;

/**
 * https://leetcode.com/problems/house-robber-ii/
 * 213. House Robber II
 */
public class HouseRobberII {

  public int rob(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    return Math.max(robHelper(nums, 1, nums.length - 1),
            robHelper(nums, 0, nums.length - 2));
  }

  public int robHelper(int[] nums, int start, int end) {
    if (start == end) {
      return nums[start];
    }
    int two = nums[start];
    int one = Math.max(two, nums[start + 1]);
    for (int i = start + 2; i <= end; i++) {
      int temp = Math.max(nums[i] + two, one);
      two = one;
      one = temp;
    }
    return one;
  }
}

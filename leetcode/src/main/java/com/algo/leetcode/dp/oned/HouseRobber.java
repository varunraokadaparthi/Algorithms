package com.algo.leetcode.dp.oned;

/**
 * https://leetcode.com/problems/house-robber/
 * 198. House Robber
 */
public class HouseRobber {

  public int rob(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int two = nums[0];
    int one = Math.max(two, nums[1]);
    for (int i = 2; i < nums.length; i++) {
      int temp = Math.max(nums[i] + two, one);
      two = one;
      one = temp;
    }
    return one;
  }

  public int robArray(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int[] C = new int[nums.length];
    C[0] = nums[0];
    C[1] = Math.max(C[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      C[i] = Math.max(nums[i] + C[i - 2], C[i - 1]);
    }
    return C[nums.length - 1];
  }
}

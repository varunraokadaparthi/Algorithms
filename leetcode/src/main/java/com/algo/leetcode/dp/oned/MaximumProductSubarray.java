package com.algo.leetcode.dp.oned;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-subarray/description/
 * 152. Maximum Product Subarray
 */
public class MaximumProductSubarray {

  public int maxProduct(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int result = Arrays.stream(nums).max().getAsInt();
    int curMin = 1;
    int curMax = 1;
    for (int num : nums) {
      if (num == 0) {
        curMin = 1;
        curMax = 1;
        continue;
      }
      int l1 = curMin * num;
      int l2 = curMax * num;
      curMax = Math.max(num, Math.max(l1, l2));
      curMin = Math.min(num, Math.min(l1, l2));
      result = Math.max(result, curMax);
    }
    return result;
  }
}

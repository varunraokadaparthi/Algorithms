package com.algo.leetcode.dp.oned;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * 300. Longest Increasing Subsequence
 */
public class LongestIncreasingSubsequence {

  public int lengthOfLIS(int[] nums) {
    int[] cache = new int[nums.length];
    Arrays.fill(cache, -1);
    return IntStream.range(0, nums.length)
            .boxed()
            .map(i -> dfs(nums, i, cache))
            .mapToInt(Integer::intValue)
            .max()
            .getAsInt();
  }

  private int dfs(int[] nums, int index, int[] cache) {
    if (cache[index] != -1) {
      return cache[index];
    }
    if (index == nums.length - 1) {
      cache[index] = 1;
      return 1;
    }
    int count = 0;
    for (int i = index + 1; i < nums.length; i++) {
      if (nums[i] > nums[index]) {
        count = Math.max(count, dfs(nums, i, cache));
      }
    }
    cache[index] = 1 + count;
    return cache[index];
  }

  public int lengthOfLISdp(int[] nums) {
    if (nums.length == 1) {
      return 1;
    }
    int[] dp = new int[nums.length];
    dp[nums.length - 1] = 1;
    int max = Integer.MIN_VALUE;
    for (int i = nums.length - 2; i >= 0; i--) {
      int count = 0;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] > nums[i]) {
          count = Math.max(count, dp[j]);
        }
      }
      dp[i] = 1 + count;
      max = Math.max(max, dp[i]);
    }
    return max;
  }
}

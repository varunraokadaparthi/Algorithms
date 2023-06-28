package com.algo.leetcode.dp.oned;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * 746. Min Cost Climbing Stairs
 */
public class MinCostClimbingStairs {

  public int minCostClimbingStairs(int[] cost) {
    int two = cost[0];
    int one = cost[1];
    for (int i = 2; i < cost.length; i++) {
      int sum = Math.min(two, one) + cost[i];
      two = one;
      one = sum;
    }
    return Math.min(two, one);
  }

  public int minCostClimbingStairsArray(int[] cost) {
    int[] C = new int[cost.length];
    C[0] = cost[0];
    C[1] = cost[1];
    for (int i = 2; i < cost.length; i++) {
      C[i] = Math.min(C[i-1], C[i-2]) + cost[i];
    }
    return Math.min(C[cost.length - 1], C[cost.length - 2]);
  }
}

package com.algo.leetcode.dp.oned;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * 70. Climbing Stairs
 */
public class ClimbingStairs {

  public int climbStairs(int n) {
    int one = 1;
    int two = 1;
    for (int i = n - 2; i >= 0; i--) {
      int sum = one + two;
      two = one;
      one = sum;
    }
    return one;
  }
}

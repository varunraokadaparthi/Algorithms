package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostClimbingStairsTest {

  private MinCostClimbingStairs stairs = new MinCostClimbingStairs();

  @Test
  public void testMinCostClimbingStairsTest1() {
    int[] cost = {10,15,20};
    assertEquals(15, stairs.minCostClimbingStairs(cost));
  }

  @Test
  public void testMinCostClimbingStairsTest2() {
    int[] cost = {1,100,1,1,1,100,1,1,100,1};
    assertEquals(6, stairs.minCostClimbingStairs(cost));
  }

}
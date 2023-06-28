package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

  private ClimbingStairs stairs = new ClimbingStairs();

  @Test
  public void testClimbingStairs5() {
    assertEquals(8, stairs.climbStairs(5));
  }

  @Test
  public void testClimbingStairs2() {
    assertEquals(2, stairs.climbStairs(2));
  }

  @Test
  public void testClimbingStairs3() {
    assertEquals(3, stairs.climbStairs(3));
  }
}
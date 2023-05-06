package com.algo.leetcode.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {
  private TrappingRainWater waterTrap = new TrappingRainWater();

  @Test
  public void testTrappingRainWaterTest1() {
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    assertEquals(6, waterTrap.trap(height));
  }

  @Test
  public void testTrappingRainWaterTest2() {
    int[] height = {4, 2, 0, 3, 2, 5};
    assertEquals(9, waterTrap.trap(height));
  }
}
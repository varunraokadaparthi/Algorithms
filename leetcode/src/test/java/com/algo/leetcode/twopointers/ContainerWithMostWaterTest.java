package com.algo.leetcode.twopointers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for ContainerWithMostWater.
 */
public class ContainerWithMostWaterTest {

  private ContainerWithMostWater container;

  @Before
  public void preSetup() {
    container = new ContainerWithMostWater();
  }

  @Test
  public void testContainerWithMostWaterTest1() {
    int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    assertEquals(49, container.maxArea(heights));
  }

  @Test
  public void testContainerWithMostWaterTest2() {
    int[] heights = {1, 1};
    assertEquals(1, container.maxArea(heights));
  }

  @Test
  public void testContainerWithMostWaterTest3() {
    int[] heights = {0, 10};
    assertEquals(0, container.maxArea(heights));
  }

}
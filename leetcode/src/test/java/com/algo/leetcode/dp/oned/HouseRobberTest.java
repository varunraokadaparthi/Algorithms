package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

  private HouseRobber robber = new HouseRobber();

  @Test
  public void testHouseRobberTest1() {
    int[] nums = {1,2,3,1};
    assertEquals(4, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest2() {
    int[] nums = {2,7,9,3,1};
    assertEquals(12, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest3() {
    int[] nums = {2,1,1,2};
    assertEquals(4, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest4() {
    int[] nums = {0};
    assertEquals(0, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest5() {
    int[] nums = {0, 2};
    assertEquals(2, robber.rob(nums));
  }

}
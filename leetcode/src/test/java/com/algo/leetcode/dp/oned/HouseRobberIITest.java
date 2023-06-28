package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberIITest {

  private HouseRobberII robber = new HouseRobberII();

  @Test
  public void testHouseRobberTest1() {
    int[] nums = {2,3,2};
    assertEquals(3, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest2() {
    int[] nums = {1,2,3,1};
    assertEquals(4, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest3() {
    int[] nums = {1,2,3};
    assertEquals(3, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest4() {
    int[] nums = {1,2};
    assertEquals(2, robber.rob(nums));
  }

  @Test
  public void testHouseRobberTest5() {
    int[] nums = {1};
    assertEquals(1, robber.rob(nums));
  }
}
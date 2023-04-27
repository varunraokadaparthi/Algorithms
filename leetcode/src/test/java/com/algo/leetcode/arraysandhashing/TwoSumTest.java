package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for TwoSum.
 */
public class TwoSumTest {

  private TwoSum sum;

  @Before
  public void preSetup() {
    sum = new TwoSum();
  }

  @Test
  public void testTwoSumTest1() {
    int[] nums = {2,7,11,15};
    int[] expectedArray = {0, 1};
    assertArrayEquals(expectedArray, sum.twoSum(nums, 9));
  }

  @Test
  public void testTwoSumTest2() {
    int[] nums = {3,3};
    int[] expectedArray = {0, 1};
    assertArrayEquals(expectedArray, sum.twoSum(nums, 6));
  }
}
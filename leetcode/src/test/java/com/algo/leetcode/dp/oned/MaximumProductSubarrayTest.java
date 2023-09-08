package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductSubarrayTest {

  private MaximumProductSubarray subarray = new MaximumProductSubarray();

  @Test
  public void test1() {

    int[] nums = {2,3,-2,4};
    assertEquals(6, subarray.maxProduct(nums));
  }

  @Test
  public void test2() {

    int[] nums = {-2,0,-1};
    assertEquals(0, subarray.maxProduct(nums));
  }

}
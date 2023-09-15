package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionEqualSubsetSumTest {

  private final PartitionEqualSubsetSum subsetSum = new PartitionEqualSubsetSum();

  @Test
  public void test1() {
    int[] nums = {1,5,11,5};
    assertTrue(subsetSum.canPartition(nums));
  }

  @Test
  public void test2() {
    int[] nums = {1,2,3,5};
    assertFalse(subsetSum.canPartition(nums));
  }

}
package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {

  private final LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();

  @Test
  public void test1() {
    int[] nums = {10,9,2,5,3,7,101,18};
    assertEquals(4, subsequence.lengthOfLIS(nums));
  }

  @Test
  public void test2() {
    int[] nums = {0,1,0,3,2,3};
    assertEquals(4, subsequence.lengthOfLIS(nums));
  }

  @Test
  public void test3() {
    int[] nums = {7,7,7,7,7,7,7};
    assertEquals(1, subsequence.lengthOfLIS(nums));
  }



}
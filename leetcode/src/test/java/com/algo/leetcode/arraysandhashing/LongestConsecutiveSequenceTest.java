package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for LongestConsecutiveSequence.
 */
public class LongestConsecutiveSequenceTest {

  private LongestConsecutiveSequence sequence;

  @Before
  public void preSetup(){
    sequence = new LongestConsecutiveSequence();
  }

  @Test
  public void testLongestConsecutiveSequenceTest1() {
    int[] nums = {100, 4, 200, 1, 3, 2};
    assertEquals(4, sequence.longestConsecutive(nums));
  }

  @Test
  public void testLongestConsecutiveSequenceTest12() {
    int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    assertEquals(9, sequence.longestConsecutive(nums));
  }
}
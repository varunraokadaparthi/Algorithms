package com.algo.leetcode.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestRepeatingCharacterReplacementTest {

  private LongestRepeatingCharacterReplacement replacement =
          new LongestRepeatingCharacterReplacement();

  @Test
  public void testLongestRepeatingCharacterReplacement1() {
    String s = "ABAB";
    assertEquals(4, replacement.characterReplacement(s, 2));
  }

  @Test
  public void testLongestRepeatingCharacterReplacement2() {
    String s = "AABABBA";
    assertEquals(4, replacement.characterReplacement(s, 1));
  }

}
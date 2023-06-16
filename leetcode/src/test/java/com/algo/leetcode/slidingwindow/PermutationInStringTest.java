package com.algo.leetcode.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationInStringTest {

  private PermutationInString string = new PermutationInString();

  @Test
  public void testPermutationInStringTrue() {
    String s1 = "ab";
    String s2 = "eidbaooo";
    assertEquals(true, string.checkInclusion(s1, s2));
  }

  @Test
  public void testPermutationInStringFalse() {
    String s1 = "ab";
    String s2 = "eidboaoo";
    assertEquals(false, string.checkInclusion(s1, s2));
  }

  @Test
  public void testPermutationInStringTrueCustom() {
    String s1 = "abc";
    String s2 = "abdacecafcba";
    assertEquals(true, string.checkInclusion(s1, s2));
  }

}
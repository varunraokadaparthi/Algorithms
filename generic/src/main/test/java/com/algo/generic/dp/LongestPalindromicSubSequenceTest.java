package com.algo.generic.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubSequenceTest {

  private LongestPalindromicSubSequence sequence = new LongestPalindromicSubSequence();

  @Test
  public void testLongestPalindromicSubSequence() {
    String s1 = "character";
    assertEquals("carac", sequence.sequence(s1));
  }

  @Test
  public void testLongestPalindromicSubSequenceTest2() {
    String s1 = "deed";
    assertEquals("deed", sequence.sequence(s1));
  }

  @Test
  public void testLongestPalindromicSubSequenceTest3() {
    String s1 = "BCADB";
    assertEquals("BAB", sequence.sequence(s1));
  }

  @Test
  public void testLongestPalindromicSubSequenceTest4() {
    String s1 = "BCADC";
    assertEquals("CAC", sequence.sequence(s1));
  }

  @Test
  public void testLongestPalindromicSubSequenceTest5() {
    String s1 = "dcapd";
    assertEquals("dad", sequence.sequence(s1));
  }

}
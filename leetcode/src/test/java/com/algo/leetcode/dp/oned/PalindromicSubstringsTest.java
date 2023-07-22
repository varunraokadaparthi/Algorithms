package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicSubstringsTest {

  private PalindromicSubstrings substrings = new PalindromicSubstrings();

  @Test
  public void testPalindromicSubstringsTest1() {
    String s = "abc";
    assertEquals(3, substrings.countSubstrings(s));
  }

  @Test
  public void testPalindromicSubstringsTest2() {
    String s = "aaa";
    assertEquals(6, substrings.countSubstrings(s));
  }

  @Test
  public void testPalindromicSubstringsTest3() {
    String s = "ac";
    assertEquals(2, substrings.countSubstrings(s));
  }

  @Test
  public void testPalindromicSubstringsTest4() {
    String s = "ccd";
    assertEquals(4, substrings.countSubstrings(s));
  }

  @Test
  public void testPalindromicSubstringsTest5() {
    String s = "c";
    assertEquals(1, substrings.countSubstrings(s));
  }

  @Test
  public void testPalindromicSubstringsTest6() {
    String s = "aa";
    assertEquals(3, substrings.countSubstrings(s));
  }

}
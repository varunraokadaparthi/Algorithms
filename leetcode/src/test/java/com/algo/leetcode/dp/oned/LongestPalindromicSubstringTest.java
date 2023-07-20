package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

  private LongestPalindromicSubstring substring = new LongestPalindromicSubstring();

  @Test
  public void testLongestPalindromicSubstringTest1() {
    String s = "babad";
    String expectedString = "bab";
    assertEquals(expectedString, substring.longestPalindrome(s));
  }

  @Test
  public void testLongestPalindromicSubstringTest2() {
    String s = "cbbd";
    String expectedString = "bb";
    assertEquals(expectedString, substring.longestPalindrome(s));
  }

  @Test
  public void testLongestPalindromicSubstringTest3() {
    String s = "ac";
    String expectedString = "c";
    assertEquals(expectedString, substring.longestPalindrome(s));
  }

  @Test
  public void testLongestPalindromicSubstringTest4() {
    String s = "ccd";
    String expectedString = "cc";
    assertEquals(expectedString, substring.longestPalindrome(s));
  }

  @Test
  public void testLongestPalindromicSubstringTest5() {
    String s = "abcda";
    String expectedString = "a";
    assertEquals(expectedString, substring.longestPalindrome(s));
  }

  @Test
  public void testLongestPalindromicSubstringTest6() {
    String s = "c";
    String expectedString = "c";
    assertEquals(expectedString, substring.longestPalindrome(s));
  }

  @Test
  public void testLongestPalindromicSubstringTest7() {
    String s = "aaaa";
    String expectedString = "aaaa";
    assertEquals(expectedString, substring.longestPalindrome(s));
  }
}
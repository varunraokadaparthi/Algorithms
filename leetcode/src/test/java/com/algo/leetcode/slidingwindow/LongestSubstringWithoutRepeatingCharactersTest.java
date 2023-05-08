package com.algo.leetcode.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

  private LongestSubstringWithoutRepeatingCharacters substring =
          new LongestSubstringWithoutRepeatingCharacters();

  @Test
  public void test1() {
    String s = "abcabcbb";
    assertEquals(3, substring.lengthOfLongestSubstring(s));
  }

  @Test
  public void test2() {
    String s = "bbbbb";
    assertEquals(1, substring.lengthOfLongestSubstring(s));
  }

  @Test
  public void test3() {
    String s = "pwwkew";
    assertEquals(3, substring.lengthOfLongestSubstring(s));
  }

  @Test
  public void test4() {
    String s = "dvdf";
    assertEquals(3, substring.lengthOfLongestSubstring(s));
  }

}
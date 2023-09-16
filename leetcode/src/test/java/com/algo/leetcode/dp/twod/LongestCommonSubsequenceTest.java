package com.algo.leetcode.dp.twod;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

  private final LongestCommonSubsequence subsequence = new LongestCommonSubsequence();

  @Test
  public void test1() {

    String text1 = "abcde", text2 = "ace";
    assertEquals(3, subsequence.longestCommonSubsequence(text1, text2));
  }

  @Test
  public void test2() {

    String text1 = "abc", text2 = "abc";
    assertEquals(3, subsequence.longestCommonSubsequence(text1, text2));
  }

  @Test
  public void test3() {

    String text1 = "abc", text2 = "def";
    assertEquals(0, subsequence.longestCommonSubsequence(text1, text2));
  }

}
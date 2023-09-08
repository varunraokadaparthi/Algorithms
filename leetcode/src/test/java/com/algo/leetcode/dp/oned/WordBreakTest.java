package com.algo.leetcode.dp.oned;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreakTest {

  private WordBreak aBreak = new WordBreak();

  @Test
  public void test1() {
    String s = "leetcode";
    List<String> wordDict = Arrays.asList("leet","code");
    assertTrue(aBreak.wordBreak(s, wordDict));
  }

  @Test
  public void test2() {
    String s = "applepenapple";
    List<String> wordDict = Arrays.asList("apple","pen");
    assertTrue(aBreak.wordBreak(s, wordDict));
  }

  @Test
  public void test3() {
    String s = "catsandog";
    List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
    assertFalse(aBreak.wordBreak(s, wordDict));
  }

}
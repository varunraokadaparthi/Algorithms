package com.algo.leetcode.slidingwindow;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {

  private MinimumWindowSubstring substring = new MinimumWindowSubstring();

  @Test
  public void testMinimumWindowSubstringTest1() {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    assertEquals("BANC", substring.minWindow(s,t));
  }

  @Test
  public void testMinimumWindowSubstringTest2() {
    String s = "a";
    String t = "a";
    assertEquals("a", substring.minWindow(s,t));
  }

  @Test
  public void testMinimumWindowSubstringTest3() {
    String s = "a";
    String t = "b";
    assertEquals("", substring.minWindow(s,t));
  }

  @Test
  public void testMinimumWindowSubstringEmptyStringOutput() {
    String s = "a";
    String t = "aa";
    assertEquals("", substring.minWindow(s,t));
  }

  @Test
  public void testIsSubSetTrue() {
    String s = "a";
    String t = "a";
    Map<Character, Integer> mapT = new HashMap(26);
    Map<Character, Integer> mapS = new HashMap(26);
    for (int i = 0; i < t.length(); i++) {
      mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
    }
    for (int j = 0; j < s.length(); j++) {
      mapS.put(t.charAt(j), mapS.getOrDefault(s.charAt(j), 0) + 1);
    }
    assertEquals(true, substring.isSubSet(mapT, mapS));
  }

  @Test
  public void testIsSubSetFalse() {
    String s = "a";
    String t = "aa";
    Map<Character, Integer> mapT = new HashMap(26);
    Map<Character, Integer> mapS = new HashMap(26);
    for (int i = 0; i < t.length(); i++) {
      mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
    }
    for (int j = 0; j < s.length(); j++) {
      mapS.put(t.charAt(j), mapS.getOrDefault(s.charAt(j), 0) + 1);
    }
    assertEquals(false, substring.isSubSet(mapT, mapS));
  }
}
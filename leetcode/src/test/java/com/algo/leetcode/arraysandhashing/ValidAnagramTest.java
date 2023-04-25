package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for ValidAnagram.
 */
public class ValidAnagramTest {

  private ValidAnagram anagram;

  @Before
  public void preSetup() {
    anagram = new ValidAnagram();
  }

  @Test
  public void testValidAnagramMapTrue() {
    assertTrue(anagram.isAnagramMap("anagram", "nagaram"));
  }

  @Test
  public void testValidAnagramMapFalse() {
    assertFalse(anagram.isAnagramMap("rat", "car"));
  }

  @Test
  public void testValidAnagramArrayTrue() {
    assertTrue(anagram.isAnagramArray("anagram", "nagaram"));
  }

  @Test
  public void testValidAnagramArrayFalse() {
    assertFalse(anagram.isAnagramArray("rat", "car"));
  }
}
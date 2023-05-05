package com.algo.leetcode.twopointers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for ValidPalindrome.
 */
public class ValidPalindromeTest {

  private ValidPalindrome palindrome;

  @Before
  public void preSetup() {
    palindrome = new ValidPalindrome();
  }

  @Test
  public void testValidPalindromeTrue() {
    String s = "A man, a plan, a canal: Panama";
    assertTrue(palindrome.isPalindrome(s));
  }

  @Test
  public void testValidPalindromeFalse() {
    String s = "race a car";
    assertFalse(palindrome.isPalindrome(s));
  }

  @Test
  public void testValidPalindromeTrueEmpty() {
    String s = " ";
    assertTrue(palindrome.isPalindrome(s));
  }

  @Test
  public void testValidPalindromeOnlySpecialCharacters() {
    String s = ".,";
    assertTrue(palindrome.isPalindrome(s));
  }
}
package com.algo.leetcode.twopointers;

/**
 * https://leetcode.com/problems/valid-palindrome/
 * 125. Valid Palindrome
 */
public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    int leftPointer = 0;
    int rightPointer = s.length() - 1;
    s = s.toLowerCase();
    while (rightPointer > leftPointer) {
      while (leftPointer < rightPointer && !Character.isAlphabetic(s.charAt(leftPointer)) && !Character.isDigit(s.charAt(leftPointer))) {
        leftPointer++;
      }
      while (rightPointer > leftPointer && !Character.isAlphabetic(s.charAt(rightPointer)) && !Character.isDigit(s.charAt(rightPointer))) {
        rightPointer--;
      }
      if (rightPointer > leftPointer && s.charAt(leftPointer) != s.charAt(rightPointer)) {
        return false;
      } else {
        leftPointer++;
        rightPointer--;
      }
    }
    return true;
  }
}

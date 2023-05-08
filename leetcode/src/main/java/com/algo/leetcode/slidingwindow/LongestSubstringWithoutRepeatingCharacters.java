package com.algo.leetcode.slidingwindow;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 3. Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {

    Set<Character> set = new HashSet<>();
    int leftPointer = 0;
    int rightPointer = leftPointer + 1 ;
    int lengthOfLongestSubstring = 0;
    while (rightPointer < s.length() && leftPointer < s.length()) {
      if (set.contains(s.charAt(rightPointer))) {
        while (leftPointer < s.length() && s.charAt(leftPointer) != s.charAt(rightPointer)) {
          set.remove(s.charAt(leftPointer));
          leftPointer++;
        }
        leftPointer++;
      } else {
        set.add(s.charAt(rightPointer));
        lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring,
                rightPointer - leftPointer);
        rightPointer++;
      }
    }
    return lengthOfLongestSubstring;
  }
}

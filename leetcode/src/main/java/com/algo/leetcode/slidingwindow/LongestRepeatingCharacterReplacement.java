package com.algo.leetcode.slidingwindow;

/**
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 * 424. Longest Repeating Character Replacement
 */
public class LongestRepeatingCharacterReplacement {

  public int characterReplacement(String s, int k) {

    int longestRepeatingCharacterReplacement = 0;
    int[] alphabetsCount = new int[26];
    int leftPointer = 0;
    int rightPointer = 0;
    while(rightPointer < s.length()) {
      alphabetsCount[s.charAt(rightPointer) - 'A'] += 1;
      while ((rightPointer - leftPointer + 1)
              - getCountOfMostRepeatingCharacter(alphabetsCount) > k) {
        alphabetsCount[s.charAt(leftPointer) - 'A'] -= 1;
        leftPointer++;
      }
      longestRepeatingCharacterReplacement = Math.max(longestRepeatingCharacterReplacement,
              (rightPointer - leftPointer + 1));
      rightPointer++;
    }
    return longestRepeatingCharacterReplacement;
  }

  public int characterReplacementOptimized(String s, int k) {

    int longestRepeatingCharacterReplacement = 0;
    int[] alphabetsCount = new int[26];
    int leftPointer = 0;
    int rightPointer = 0;
    int maxFrequency = 0;
    while(rightPointer < s.length()) {
      alphabetsCount[s.charAt(rightPointer) - 'A'] += 1;
      maxFrequency = Math.max(maxFrequency,
              alphabetsCount[s.charAt(rightPointer) - 'A']);
      while ((rightPointer - leftPointer + 1)
              - maxFrequency > k) {
        alphabetsCount[s.charAt(leftPointer) - 'A'] -= 1;
        leftPointer++;
      }
      longestRepeatingCharacterReplacement = Math.max(longestRepeatingCharacterReplacement,
              (rightPointer - leftPointer + 1));
      rightPointer++;
    }
    return longestRepeatingCharacterReplacement;
  }

  private int getCountOfMostRepeatingCharacter(int[] alphabetsCount) {
    int countOfMostRepeatingCharacter = 0;
    for (int i : alphabetsCount) {
      countOfMostRepeatingCharacter = Math.max(countOfMostRepeatingCharacter, i);
    }
    return countOfMostRepeatingCharacter;
  }
}

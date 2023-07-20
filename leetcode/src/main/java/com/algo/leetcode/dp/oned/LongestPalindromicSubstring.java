package com.algo.leetcode.dp.oned;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * 5. Longest Palindromic Substring
 */
public class LongestPalindromicSubstring {

  public String longestPalindromeNonDP(String s) {
    if (s.length() == 1) {
      return s;
    } else if (s.length() == 2) {
      return s.charAt(0) == s.charAt(1) ? s : s.substring(1, 2);
    }
    int longest = 1;
    int startIndex = -1;
    int endIndex = -1;
    for (int i = 1; i < s.length() - 1; i++) {
      int low = i - 1;
      int high = i + 1;
      while (low >= 0 && high < s.length()) {
        if (s.charAt(low) == s.charAt(high)) {
          if (high - low + 1 > longest) {
            longest = high - low + 1;
            startIndex = low;
            endIndex = high;
          }
          low--;
          high++;
        } else {
          break;
        }
      }
    }

    for (int i = 0; i < s.length() - 1; i++) {
      int low = i;
      int high = i + 1;
      while (low >= 0 && high < s.length()) {
        if (s.charAt(low) == s.charAt(high)) {
          if (high - low + 1 > longest) {
            longest = high - low + 1;
            startIndex = low;
            endIndex = high;
          }
          low--;
          high++;
        } else {
          break;
        }
      }
    }
    return startIndex == -1 && endIndex == -1 ?
            String.valueOf(s.charAt(0)) :
              s.substring(startIndex, endIndex + 1);
  }

  public String longestPalindrome(String s) {
    if (s.length() == 1) {
      return s;
    } else if (s.length() == 2) {
      return s.charAt(0) == s.charAt(1) ? s : String.valueOf(s.charAt(1));
    }
    int[][] dp = new int[s.length()][s.length()];
    int start = -1;
    int end = -1;
    for (int i = 0; i < s.length(); i++) {
      dp[i][i] = 1;
    }
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        dp[i][i+1] = 1;
        if (end - start < 1) {
          start = i;
          end = i+1;
        }
      }
    }
    for (int i = 0; i < s.length() - 2; i ++) {
      int k = 0;
      int j = i + 2;
      while (j < s.length()) {
        if (s.charAt(k) == s.charAt(j) && dp[k + 1][j - 1] == 1) {
          dp[k][j] = 1;
          if (end - start < j - k) {
            start = k;
            end = j;
          }
        } else {
          dp[k][j] = 0;
        }
        k++;
        j++;
      }
    }
    for (int[] nums : dp) {
      for (int num : nums) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
    return start == -1 && end == -1 ?
            String.valueOf(s.charAt(s.length() - 1)) :
              s.substring(start, end + 1);
  }
}

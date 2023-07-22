package com.algo.leetcode.dp.oned;

/**
 * https://leetcode.com/problems/palindromic-substrings/
 * 647. Palindromic Substrings
 */
public class PalindromicSubstrings {

  public int countSubstrings(String s) {
    if (s.length() == 1) {
      return 1;
    } else if (s.length() == 2) {
      return s.charAt(0) == s.charAt(1) ? 3 : 2;
    }
    int count = 0;
    int[][] dp = new int[s.length()][s.length()];
    for (int i = 0; i < s.length(); i++) {
      dp[i][i] = 1;
      count++;
    }
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        dp[i][i+1] = 1;
        count++;
      }
    }
    for (int i = 0; i < s.length() - 2; i ++) {
      int k = 0;
      int j = i + 2;
      while (j < s.length()) {
        if (s.charAt(k) == s.charAt(j) && dp[k + 1][j - 1] == 1) {
          dp[k][j] = 1;
          count++;
        } else {
          dp[k][j] = 0;
        }
        k++;
        j++;

      }
    }
    return count;
  }
}

package com.algo.leetcode.dp.oned;

/**
 * https://leetcode.com/problems/decode-ways/description/
 * 91. Decode Ways
 */
public class DecodeWays {

  public int numDecodings(String s) {

    if (s.charAt(0) == '0') {
      return 0;
    }
    int n = s.length();
    int [] dp = new int[n];
    if (s.charAt(n - 1) == '0') {
      dp[n - 1] = 0;
    } else {
      dp[n - 1] = 1;
    }
    if (s.charAt(n - 2) == '0') {
      if (dp[n - 1] == 0) {
        return 0;
      }
      dp[n - 2] = 0;
    } else {
      dp[n - 2] = dp[n - 1];
    }
    if (s.charAt(n - 2) == '1' || (s.charAt(n - 2) == '2' && s.charAt(n - 1) >= '0' && s.charAt(n - 1) <= '6')) {
      dp[n - 2] += 1;
    }


    for (int i = n - 3; i >= 0; i--) {
      if (s.charAt(i) == '0') {
        dp[i] = 0;
      } else {
        dp[i] = dp[i + 1];
      }
      if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '6')) {
        dp[i] += dp[i + 2];
      }
    }
    return dp[0];
  }

  public int numDecodingsDp(String s) {
    if (s.charAt(0) == '0') {
      return 0;
    }
    int [] dp = new int[s.length()];
    dp[0] = 1;
    if (s.charAt(1) == '0') {
      if (s.charAt(0) > '2') {
        return 0;
      } else {
        dp[1] = 1;
      }
    } else {
      if (s.charAt(0) <= '2' && s.charAt(1) <= '6') {
        dp[1] += 1;
      }
      dp[1] += 1;
    }
    for (int i = 2; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        if (s.charAt(i - 1) == '0') {
          return 0;
        } else {
          if (s.charAt(i - 1) <= '2') {
            dp[i] = dp[i - 2];
          } else {
            return 0;
          }
        }
      } else {
        if (s.charAt(i) <= '6' && s.charAt(i - 1) > '0' && s.charAt(i - 1) <= '2') {
          dp[i] += 1;
        }
        dp[i] += dp[i -1];
      }
    }
    return dp[s.length() - 1];
  }

  public int numDecodingsRecursive(String s) {
    int [] memo = new int[s.length()];
    for (int i = 0; i < memo.length; i++) {
      memo[i] = -1;
    }
    return decodeWays(s, 0, memo);
  }

  private int decodeWays(String s, int position, int [] memo) {
    if (position >= s.length()) {
      return 0;
    }

    int count = 0;
    if (memo[position] != -1) {
      return memo[position];
    } else {

      if (s.charAt(position) == '0') {
        memo[position] = 0;
        return 0;
      } else {
        if (position == s.length() - 1) {
          memo[position] = 1;
          return 1;
        }
        count += decodeWays(s, position + 1, memo);
      }

      if (position <= s.length() - 2 && (s.charAt(position) == '1') || (s.charAt(position) == '2' && s.charAt(position + 1) <= '6')) {
        if (position + 1 == s.length() - 1) {
          memo[position] = count + 1;
          return count + 1;
        }
        count += decodeWays(s, position + 2, memo);
      }
    }
    memo[position] = count;
    return count;
  }
}

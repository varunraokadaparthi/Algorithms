package com.algo.leetcode.dp.oned;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change/
 * 322. Coin Change
 */
public class CoinChange {

  public int coinChange(int[] coins, int amount) {

    Arrays.sort(coins);
    int[] dp = new int[amount + 1];
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      int min = Integer.MAX_VALUE;
      for (int j = 0; j < coins.length; j++) {
        if (i - coins[j] < 0) {
          break;
        }
        min = Math.min(min, dp[i - coins[j]]);
      }
      if (min != Integer.MAX_VALUE) {
        dp[i] = 1;
      }
      dp[i] += min;
    }

    // Arrays.stream(dp).forEach(System.out::println);
    return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
  }
}

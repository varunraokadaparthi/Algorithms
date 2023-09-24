package com.algo.leetcode.dp.twod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/coin-change-ii/
 * 518. Coin Change II
 */
public class CoinChangeII {

  public int change(int amount, int[] coins) {

    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      list.add(getArrayList(amount + 1, 0));
    }
    for (int i = coins.length - 1; i >= 0; i--) {
      list.get(1).set(0, 1);
      for (int j = 1; j <= amount; j++) {
        if (j - coins[i] >= 0) {
          list.get(1).set(j, list.get(1).get(j - coins[i]));
        }
        list.get(1).set(j, list.get(1).get(j) +  list.get(0).get(j));
      }
      List<Integer> temp = list.get(0);
      list.set(0, list.get(1));
      list.set(1, temp);
    }
    return list.get(0).get(amount);
  }

  private List<Integer> getArrayList(int length, int fillValue) {
    return Collections.nCopies(length, fillValue)
            .stream()
            .collect(Collectors.toList());
  }

  public int changeDpHighMemory(int amount, int[] coins) {

    int[][] dp = new int[coins.length][amount + 1];
    for (int i = 0; i < coins.length; i++) {
      dp[i][0] = 1;
    }
    for (int j = 1; j <= amount; j++) {
      for (int i = coins.length - 1; i >= 0; i--) {
        if (j - coins[i] >= 0) {
          dp[i][j] = dp[i][j - coins[i]];
        }
        if (i <= coins.length - 2) {
          dp[i][j] += dp[i + 1][j];
        }
      }
    }
    return dp[0][amount];
  }

  public int changeRecursive(int amount, int[] coins) {

    int[][] cache = new int[amount + 1][coins.length];
    Arrays.stream(cache).forEach(array -> Arrays.fill(array, -1));
    Arrays.sort(coins);
    int count = recursive(amount, coins, cache, 0, 0);
    Arrays.stream(cache).map(array -> Arrays.stream(array).boxed().collect(Collectors.toList())).collect(Collectors.toList()).forEach(System.out::println);
    return count;
  }

  private int recursive(int amount, int[] coins, int[][] cache, int current, int currentCoinIndex) {

    if (cache[current][currentCoinIndex] != -1) {
      return cache[current][currentCoinIndex];
    }
    if (current == amount) {
      cache[current][currentCoinIndex] = 1;
      return 1;
    }
    int count = 0;
    for (int i = currentCoinIndex; i < coins.length; i++) {
      if (current + coins[i] > amount) {
        break;
      }
      count += recursive(amount, coins, cache, current + coins[i], i);
    }
    cache[current][currentCoinIndex] = count;
    return count;
  }
}

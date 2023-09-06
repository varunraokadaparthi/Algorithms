package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {

  private CoinChange change = new CoinChange();

  @Test
  public void testCoinChangeTest1() {

    int[] coins = {1, 2, 5};
    int amount = 11;
    assertEquals(3, change.coinChange(coins, amount));
  }

  @Test
  public void testCoinChangeTest2() {

    int[] coins = {2};
    int amount = 3;
    assertEquals(-1, change.coinChange(coins, amount));
  }

}
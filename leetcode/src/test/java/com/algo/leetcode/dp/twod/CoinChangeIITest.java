package com.algo.leetcode.dp.twod;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class CoinChangeIITest {

  private final CoinChangeII change = new CoinChangeII();

  @Test
  public void test1() {
    int amount = 5;
    int[] coins = {1,2,5};
    assertEquals(4, change.change(amount, coins));
  }

  @Test
  public void test2() {
    int amount = 3;
    int[] coins = {2};
    assertEquals(0, change.change(amount, coins));
  }

}
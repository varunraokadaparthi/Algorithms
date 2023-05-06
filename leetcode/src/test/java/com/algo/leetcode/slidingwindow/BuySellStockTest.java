package com.algo.leetcode.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for BuySellStock.
 */
public class BuySellStockTest {

  private BuySellStock stock = new BuySellStock();

  @Test
  public void testBuySellStockTest1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    assertEquals(5, stock.maxProfit(prices));
  }

  @Test
  public void testBuySellStockTest2() {
    int[] prices = {7, 6, 4, 3, 1};
    assertEquals(0, stock.maxProfit(prices));
  }

}
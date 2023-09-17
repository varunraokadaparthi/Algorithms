package com.algo.leetcode.dp.twod;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * 309. Best Time to Buy and Sell Stock with Cooldown
 */
public class BestTimeBuySellStockCooldown {

  public int maxProfit(int[] prices) {

    int prevNoStock = 0;
    int prevInStock = -prices[0];
    int prevSold = 0;
    int currentNoStock = 0;
    int currentInStock = 0;
    int currentSold = 0;
    for (int i = 1; i < prices.length; i++) {
      currentNoStock = Math.max(prevNoStock, prevSold);
      currentInStock = Math.max(prevNoStock - prices[i], prevInStock);
      currentSold = prevInStock + prices[i];
      prevNoStock = currentNoStock;
      prevInStock = currentInStock;
      prevSold = currentSold;
    }
    return Math.max(currentSold, currentNoStock);
  }
}

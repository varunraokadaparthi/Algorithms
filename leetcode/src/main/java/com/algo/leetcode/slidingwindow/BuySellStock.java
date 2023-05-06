package com.algo.leetcode.slidingwindow;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 121. Best Time to Buy and Sell Stock
 */
public class BuySellStock {

  public int maxProfit(int[] prices) {

    int maxProfit = 0;
    int leftPointer = 0;
    int rightPointer = leftPointer + 1;
    while (rightPointer < prices.length) {
      if (prices[rightPointer] <= prices[leftPointer]) {
        leftPointer = rightPointer;
        rightPointer = leftPointer + 1;
      } else {
        maxProfit = Math.max(maxProfit, prices[rightPointer] - prices[leftPointer]);
        rightPointer++;
      }
    }
    return maxProfit;
  }
}

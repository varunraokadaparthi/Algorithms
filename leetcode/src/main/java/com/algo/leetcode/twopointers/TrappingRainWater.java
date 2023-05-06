package com.algo.leetcode.twopointers;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * 42. Trapping Rain Water
 */
public class TrappingRainWater {

  public int trap(int[] height) {

    int leftPointer = 0;
    int rightPointer = height.length - 1;
    int localMaximumHeight = 0;
    int trappedWater = 0;
    while (rightPointer > leftPointer) {
      localMaximumHeight = Math.max(localMaximumHeight,
              Math.min(height[leftPointer], height[rightPointer]));
      if (height[leftPointer] < height[rightPointer]) {
        trappedWater += localMaximumHeight - height[leftPointer];
        leftPointer++;
      } else {
        trappedWater += localMaximumHeight - height[rightPointer];
        rightPointer--;
      }
    }
    return trappedWater;
  }
}

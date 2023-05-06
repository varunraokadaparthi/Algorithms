package com.algo.leetcode.twopointers;

/**
 * https://leetcode.com/problems/container-with-most-water/
 * 11. Container With Most Water
 */
public class ContainerWithMostWater {

  public int maxArea(int[] height) {

    int leftPointer = 0;
    int rightPointer = height.length - 1;
    int maxArea = 0;
    while (rightPointer > leftPointer) {
      maxArea = Math.max(maxArea,
              Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer));
      if (height[rightPointer] < height[leftPointer]) {
        rightPointer--;
      } else {
        leftPointer++;
      }
    }
    return maxArea;
  }
}

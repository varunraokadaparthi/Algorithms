package com.algo.leetcode.twopointers;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 167. Two Sum II - Input Array Is Sorted
 */
public class TwoSum2SortedArray {

  public int[] twoSum(int[] numbers, int target) {

    int leftPointer = 0;
    int rightPointer  = numbers.length - 1;
    int[] result = new int[2];
    while (leftPointer < rightPointer) {
      if (numbers[leftPointer] + numbers[rightPointer] > target) {
        rightPointer--;
      } else if (numbers[leftPointer] + numbers[rightPointer] < target) {
        leftPointer++;
      } else {
        result[0] = leftPointer + 1;
        result[1] = rightPointer + 1;
        break;
      }
    }
    return result;
  }
}

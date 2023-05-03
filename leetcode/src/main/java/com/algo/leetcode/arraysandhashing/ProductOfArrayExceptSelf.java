package com.algo.leetcode.arraysandhashing;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 * 238. Product of Array Except Self
 */
public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {

    // product of elements before the current element
    int[] productBeforeCurrentElement = new int[nums.length];
    productBeforeCurrentElement[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      productBeforeCurrentElement[i] = productBeforeCurrentElement[i - 1] * nums[i];
    }

    // product of elements after the current element
    int[] productAfterCurrentElement = new int[nums.length];
    productAfterCurrentElement[nums.length - 1] = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--) {
      productAfterCurrentElement[i] = productAfterCurrentElement[i + 1] * nums[i];
    }

    // multiply before and after products
    nums[0] = productAfterCurrentElement[1];
    nums[nums.length - 1] = productBeforeCurrentElement[nums.length - 2];
    for (int i = 1; i < nums.length - 1; i++) {
        nums[i] = productBeforeCurrentElement[i-1] * productAfterCurrentElement[i+1];
    }
    return nums;
  }

  public int[] productExceptSelfMemoryOptimized(int[] nums) {
    int[] result = new int[nums.length];

    // Pass 1: product before element
    int productBeforeCurrentElement = 1;
    result[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      productBeforeCurrentElement = productBeforeCurrentElement * nums[i - 1];
      result[i] = productBeforeCurrentElement;
    }

    // Pass 2: product after element
    int productAfterCurrentElement = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
      productAfterCurrentElement = productAfterCurrentElement * nums[i + 1];
      result[i] *= productAfterCurrentElement;
    }
    return result;
  }
}

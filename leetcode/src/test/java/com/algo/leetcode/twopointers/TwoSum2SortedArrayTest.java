package com.algo.leetcode.twopointers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for TwoSum2SortedArray.
 */
public class TwoSum2SortedArrayTest {

  private TwoSum2SortedArray array;

  @Before
  public void preSetup() {
    array = new TwoSum2SortedArray();
  }

  @Test
  public void TwoSum2SortedArrayTest1() {
    int[] numbers = {2,7,11,15};
    int target = 9;
    int[] expectedArray = {1,2};
    assertArrayEquals(expectedArray, array.twoSum(numbers, target));
  }

  @Test
  public void TwoSum2SortedArrayTest2() {
    int[] numbers = {2,3,4};
    int target = 6;
    int[] expectedArray = {1,3};
    assertArrayEquals(expectedArray, array.twoSum(numbers, target));
  }

  @Test
  public void TwoSum2SortedArrayTest3() {
    int[] numbers = {-1,0};
    int target = -1;
    int[] expectedArray = {1,2};
    assertArrayEquals(expectedArray, array.twoSum(numbers, target));
  }

}
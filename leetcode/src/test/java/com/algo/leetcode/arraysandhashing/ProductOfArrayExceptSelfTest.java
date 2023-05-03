package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for ProductOfArrayExceptSelf.
 */
public class ProductOfArrayExceptSelfTest {

  private ProductOfArrayExceptSelf productOfArrayExceptSelf;

  @Before
  public void preSetup() {
    productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
  }

  @Test
  public void testProductOfArrayExceptSelfTest1() {
    int[] arr = {1,2,3,4};
    int[] expectedArray = {24,12,8,6};
    assertArrayEquals(expectedArray, productOfArrayExceptSelf.productExceptSelf(arr));
  }

  @Test
  public void testProductOfArrayExceptSelfTest2() {
    int[] arr = {-1,1,0,-3,3};
    int[] expectedArray = {0,0,9,0,0};
    assertArrayEquals(expectedArray, productOfArrayExceptSelf.productExceptSelf(arr));
  }

  @Test
  public void testProductOfArrayExceptSelfMemoryOptimizedTest1() {
    int[] arr = {1,2,3,4};
    int[] expectedArray = {24,12,8,6};
    assertArrayEquals(expectedArray, productOfArrayExceptSelf.productExceptSelfMemoryOptimized(arr));
  }

  @Test
  public void testProductOfArrayExceptSelfMemoryOptimizedTest2() {
    int[] arr = {-1,1,0,-3,3};
    int[] expectedArray = {0,0,9,0,0};
    assertArrayEquals(expectedArray, productOfArrayExceptSelf.productExceptSelfMemoryOptimized(arr));
  }
}
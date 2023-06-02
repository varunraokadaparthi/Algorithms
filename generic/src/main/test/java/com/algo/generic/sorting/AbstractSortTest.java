package com.algo.generic.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AbstractSortTest {

  private Sort sort;

  public AbstractSortTest(Sort sort) {
    this.sort = sort;
  }

  @Test
  public void testSortAsc() {
    int[] arr = {5, 4, 3, 2, 1};
    int[] expectedArray = {1, 2, 3, 4, 5};
    assertArrayEquals(expectedArray, sort.sort(arr, true));
  }

  @Test
  public void testSortDesc() {
    int[] arr = {1, 2, 3, 4, 5};
    int[] expectedArray = {5, 4, 3, 2, 1};
    assertArrayEquals(expectedArray, sort.sort(arr, false));
  }
}

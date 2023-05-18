package com.algo.generic.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

  private Sort sort;

  @Before
  public void preSetup() {
    sort = new InsertionSort();
  }

  @Test
  public void testInsertionSortAsc() {
    int[] arr = {5, 4, 3, 2, 1};
    int[] expectedArray = {1, 2, 3, 4, 5};
    assertArrayEquals(expectedArray, sort.sort(arr, true));
  }

  @Test
  public void testInsertionSortDesc() {
    int[] arr = {1, 2, 3, 4, 5};
    int[] expectedArray = {5, 4, 3, 2, 1};
    assertArrayEquals(expectedArray, sort.sort(arr, false));
  }

}
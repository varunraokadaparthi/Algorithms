package com.algo.generic.sorting;

public interface Sort {

  /**
   * Sorts the given array with O(n^2) time complexity.
   * @param arr the given array to be sorted.
   * @param order true -> asc or false -> desc
   * @return
   */
  int[] sort(int[] arr, boolean order);
}

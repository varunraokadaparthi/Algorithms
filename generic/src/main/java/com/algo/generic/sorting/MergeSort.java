package com.algo.generic.sorting;

import java.util.Arrays;

public class MergeSort implements Sort {

  private boolean order;

  @Override
  public int[] sort(int[] arr, boolean order) {

    this.order = order;
    mergeSort(arr, 0, arr.length - 1);
    return arr;
  }

  private void mergeSort(int[] arr, int start, int end) {
    if (start >= end) {
      return;
    }
    int mid = (end - start) / 2 + start;

    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);

    merge(arr, start, mid, end);
  }

  private void merge(int[] arr, int start, int mid, int end) {

    // Arrays.copyOf() needs (last index + 1) to copy even the last element.
    int[] leftArray = Arrays.copyOfRange(arr, start, mid + 1);
    int[] rightArray = Arrays.copyOfRange(arr, mid + 1, end + 1);

    int l = 0;
    int r = 0;
    int k = start;
    while (r < rightArray.length && l < leftArray.length) {
      if (order) {
        if (leftArray[l] < rightArray[r]) {
          arr[k] = leftArray[l];
          l++;
        } else {
          arr[k] = rightArray[r];
          r++;
        }
      } else {
        if (leftArray[l] > rightArray[r]) {
          arr[k] = leftArray[l];
          l++;
        } else {
          arr[k] = rightArray[r];
          r++;
        }
      }
      k++;
    }
    while (r < rightArray.length) {
      arr[k] = rightArray[r];
      r++;
      k++;
    }
    while (l < leftArray.length) {
      arr[k] = leftArray[l];
      l++;
      k++;
    }
  }
}

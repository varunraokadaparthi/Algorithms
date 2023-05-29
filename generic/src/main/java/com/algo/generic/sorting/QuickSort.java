package com.algo.generic.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort implements Sort {

  private boolean order;

  @Override
  public int[] sort(int[] arr, boolean order) {
    this.order = order;
    quickSort(arr, 0, arr.length - 1);
    return arr;
  }

  private void quickSort(int[] arr, int startIndex, int endIndex) {
    if (startIndex > endIndex) {
      return;
    }
    int pivotIndex = pivot(arr, startIndex, endIndex);
    quickSort(arr, startIndex, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, endIndex);
  }

  private int pivot(int[] arr, int startIndex, int endIndex) {

    int randomPivotIndex = (int) (Math.random() * (endIndex - startIndex) + startIndex);
    swap(arr, randomPivotIndex, endIndex);
    int pivotValue = arr[endIndex];
    int i = startIndex - 1;
    for (int j = startIndex; j < endIndex; j++) {
      if (order) {
        if (arr[j] <= pivotValue) {
          swap(arr, j, ++i);
        }
      } else  {
        if (arr[j] >= pivotValue) {
          swap(arr, j, ++i);
        }
      }
    }
    swap(arr, ++i, endIndex);
    return i;
  }

  private void swap(int[] arr, int index1, int index2) {

    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}

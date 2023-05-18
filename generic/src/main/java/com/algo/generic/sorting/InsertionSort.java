package com.algo.generic.sorting;

import java.util.Arrays;

public class InsertionSort implements Sort{


  @Override
  public int[] sort(int[] arr, boolean order) {

    if (order) {
      for(int i = 1; i < arr.length; i++) {
        int j = i - 1;
        int key = arr[i];
        while (j >= 0 && key < arr[j]) {
          arr[j + 1] = arr[j];
          j--;
        }
        arr[j + 1] = key;
      }
    } else {
      for (int i = arr.length - 2; i >= 0; i--) {
        int j = i + 1;
        int key = arr[i];
        while (j < arr.length && key < arr[j]) {
          arr[j - 1] = arr[j];
          j++;
        }
        arr[j - 1] = key;
      }
    }
    return arr;
  }
}

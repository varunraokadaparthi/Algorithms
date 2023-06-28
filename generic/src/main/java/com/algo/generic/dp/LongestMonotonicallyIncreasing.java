package com.algo.generic.dp;

import java.util.List;

public class LongestMonotonicallyIncreasing {

  public static void main(String[] args) {
    int[] arr = {8, 5, -2, -1, 9, 10, 2, 1, 3, 6, 7};
//    System.out.println(longestMonotonicallyNonDPRecursive(arr, arr.length-1));
    System.out.println(longestMonotonicallyNonDPRecursive(arr, 0));
  }

  private static int longestMonotonicallyNonDPNonRecursive(int[] arr) {
    int longestLength = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int l = i;
        int len = 1;
        for (int k = j; k < arr.length; k++) {
          if (arr[l] < arr[k]) {
            l = k;
            len++;
            longestLength = Math.max(len, longestLength);
          }
        }
      }
    }
    return longestLength;
  }

  private static int longestMonotonicallyNonDPRecursive(int[] arr, int n) {
    if (n == 0) {
      return 1;
    }
    int max = 0;
    for (int j = n-1; j >= 0; j--) {
      if (arr[j] < arr[n]) {
        max = Math.max(max, longestMonotonicallyNonDPRecursive(arr, j));
      }
    }
//    if (n == arr.length - 1) {
//      return 1;
//    }
//    int max = 0;
//    for (int j = n + 1; j < arr.length; j++) {
//      if (arr[j] > arr[n]) {
//        max = Math.max(max, longestMonotonicallyNonDPRecursive(arr, j));
//      }
//    }
    return 1 + max;
  }
}

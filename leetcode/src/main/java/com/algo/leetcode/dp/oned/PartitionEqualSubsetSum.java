package com.algo.leetcode.dp.oned;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/partition-equal-subset-sum/
 * 416. Partition Equal Subset Sum
 */
public class PartitionEqualSubsetSum {

  public boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    if (sum % 2 == 1) {
      return false;
    }
    int target = sum / 2;
    Set<Integer> set = new HashSet<>();
    set.add(0);
    for(int i = 0; i < nums.length; i++) {
      Set<Integer> newSet = new HashSet<>(set);
      for (Integer num : set) {
        int newNum = num + nums[i];
        if (newNum == target) {
          return true;
        }
        if (!set.contains(newNum) && newNum < target) {
          newSet.add(newNum);
        }
      }
      set = newSet;
    }
    return false;
  }
}

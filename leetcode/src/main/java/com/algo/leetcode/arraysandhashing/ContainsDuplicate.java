package com.algo.leetcode.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * 217. Contains Duplicate
 */
public class ContainsDuplicate {

  public boolean containsDuplicate(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (int element : arr) {
      if(set.contains(element)) {
        return true;
      } else {
        set.add(element);
      }
    }
    return false;
  }
}

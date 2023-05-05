package com.algo.leetcode.arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 * 128. Longest Consecutive Sequence
 */
public class LongestConsecutiveSequence {

  public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    int longestConsecutiveSequenceLength = 0;
    for (int num : nums) {
      if (!set.contains(num - 1)) {
        int countOfCurrentSequence = 0;
        while (set.contains(num++)) {
          countOfCurrentSequence++;
          longestConsecutiveSequenceLength = Math.max(countOfCurrentSequence,
                  longestConsecutiveSequenceLength);
        }
      }
    }
    return longestConsecutiveSequenceLength;
  }
}

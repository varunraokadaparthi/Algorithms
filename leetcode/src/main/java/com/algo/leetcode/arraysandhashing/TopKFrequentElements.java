package com.algo.leetcode.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 * 347. Top K Frequent Elements
 */
public class TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    List<Integer> result = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() >= k) {
        result.add(entry.getKey());
      }
    }
    return Arrays.stream(result.toArray()).mapToInt(i -> (int) i).toArray();
  }
}

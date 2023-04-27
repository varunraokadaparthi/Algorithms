package com.algo.leetcode.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams/
 * 49. Group Anagrams
 * strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<List<Integer>, List<String>> map = new HashMap<>();

    for (String str : strs) {
      List<Integer> lowerCaseAlphabetIndexArray = new ArrayList<>(Collections.nCopies(26, 0));
      for (char c : str.toCharArray()) {
        lowerCaseAlphabetIndexArray.set((c - 'a'), lowerCaseAlphabetIndexArray.get(c - 'a') + 1);
      }

      if (map.containsKey(lowerCaseAlphabetIndexArray)) {
        map.get(lowerCaseAlphabetIndexArray).add(str);
      } else {
        map.put(lowerCaseAlphabetIndexArray, new ArrayList<>(Arrays.asList(str)));
      }
    }
    return new ArrayList<>(map.values());
  }
}

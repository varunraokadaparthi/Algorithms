package com.algo.leetcode.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/valid-anagram/
 * 242. Valid Anagram
 */
public class ValidAnagram {

  public boolean isAnagramMap(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<>();
    for (Character c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (Character c : t.toCharArray()) {
      if (map.containsKey(c)) {
        if (map.get(c) == 1) {
          map.remove(c);
        } else {
          map.put(c, map.get(c) - 1);
        }
      } else {
        return false;
      }
    }
    return map.size() == 0 ? true : false;
  }

  public boolean isAnagramArray(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] lowerCaseAlphabetArray = new int[26];
    for (Character c : s.toCharArray()) {
      lowerCaseAlphabetArray[c - 'a'] = lowerCaseAlphabetArray[c - 'a'] + 1;
    }
    for (Character c : t.toCharArray()) {
      if (lowerCaseAlphabetArray[c - 'a'] == 0) {
        return false;
      } else {
        lowerCaseAlphabetArray[c - 'a'] = lowerCaseAlphabetArray[c - 'a'] - 1;
      }
    }
    for (int i = 0; i < 26; i++) {
      if (lowerCaseAlphabetArray[i] != 0) {
        return false;
      }
    }
    return true;
  }

}

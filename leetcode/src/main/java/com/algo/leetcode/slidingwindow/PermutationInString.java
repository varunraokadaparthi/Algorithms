package com.algo.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/permutation-in-string/
 * 567. Permutation in String
 */
public class PermutationInString {

  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    }
    Map<Character, Integer> s1Map = new HashMap<>(26);
    Map<Character, Integer> s2Map = new HashMap<>(26);
    for (byte i = 0; i < 26; i++) {
      s1Map.put((char) ('a' + i), 0);
      s2Map.put((char) ('a' + i), 0);
    }
    for (char c : s1.toCharArray()) {
      s1Map.put(c, s1Map.get(c) + 1);
    }
    int leftPointer = 0;
    int rightPointer;
    for (rightPointer = 0; rightPointer < s1.length(); ++rightPointer) {
      s2Map.put(s2.charAt(rightPointer), s2Map.get(s2.charAt(rightPointer)) + 1);
    }

    byte matches = 0;
    for (Map.Entry<Character, Integer> set : s1Map.entrySet()) {
      if (set.getValue() == s2Map.get(set.getKey())) {
        matches++;
      }
    }

    while (rightPointer < s2.length()) {
      if (matches == 26) {
        return true;
      }
      s2Map.put(s2.charAt(leftPointer), s2Map.get(s2.charAt(leftPointer)) - 1);
      if (s1Map.get(s2.charAt(leftPointer)) == s2Map.get(s2.charAt(leftPointer)) + 1) {
        matches--;
      } else if(s1Map.get(s2.charAt(leftPointer)) == s2Map.get(s2.charAt(leftPointer))) {
        matches++;
      }
      leftPointer++;
      s2Map.put(s2.charAt(rightPointer), s2Map.get(s2.charAt(rightPointer)) + 1);
      if (s1Map.get(s2.charAt(rightPointer)) == s2Map.get(s2.charAt(rightPointer)) - 1) {
        matches--;
      } else if(s1Map.get(s2.charAt(rightPointer)) == s2Map.get(s2.charAt(rightPointer))) {
        matches++;
      }
      rightPointer++;
    }
    return matches == 26;
  }

  public boolean checkInclusionUnOptimized(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    }
    Map<Character, Integer> s1Map = new HashMap<>();
    for (char c : s1.toCharArray()) {
      s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
    }
    int leftPointer = 0;
    int rightPointer;
    Map<Character, Integer> s2Map = new HashMap<>();
    for (rightPointer = 0; rightPointer < s1.length(); ++rightPointer) {
      s2Map.put(s2.charAt(rightPointer), s2Map.getOrDefault(s2.charAt(rightPointer), 0) + 1);
    }
    if (s1Map.equals(s2Map)) {
      return true;
    }
    while (rightPointer < s2.length()) {
      s2Map.put(s2.charAt(leftPointer), s2Map.get(s2.charAt(leftPointer)) - 1);
      if (s2Map.get(s2.charAt(leftPointer)) == 0) {
        s2Map.remove(s2.charAt(leftPointer));
      }
      leftPointer++;
      s2Map.put(s2.charAt(rightPointer), s2Map.getOrDefault(s2.charAt(rightPointer), 0) + 1);
      rightPointer++;
      if (s1Map.equals(s2Map)) {
        return true;
      }
    }
    return false;
  }
}

package com.algo.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-window-substring/
 * 76. Minimum Window Substring
 */
public class MinimumWindowSubstring {

  public String minWindow(String s, String t) {
    if (t.length() > s.length()) {
      return "";
    }
    Map<Character, Integer> mapT = new HashMap(26);
    Map<Character, Integer> mapS = new HashMap(26);
    for (int i = 0; i < t.length(); i++) {
      mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
    }
    for (int j = 0; j < t.length(); j++) {
      if (mapT.containsKey(s.charAt(j))) {
        mapS.put(s.charAt(j), mapS.getOrDefault(s.charAt(j), 0) + 1);
      }
    }
    int have = getCountOfCommonElements(mapT, mapS);
    int need = mapT.size();
    int l = 0;
    int r = t.length();
    int minL = 0;
    int minR = 0;
    int min = Integer.MAX_VALUE;

    while (r < s.length()) {
      if (need != have) {
        if (mapT.containsKey(s.charAt(r))) {
          mapS.put(s.charAt(r), mapS.getOrDefault(s.charAt(r), 0) + 1);
          if (mapS.get(s.charAt(r)) == mapT.get(s.charAt(r))) {
            have++;
          }
        }
        r++;
      } else {
        while (need == have) {
          if (mapT.containsKey(s.charAt(l))) {
            mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);
            if (mapS.get(s.charAt(l)) < mapT.get(s.charAt(l))) {
              have--;
            }
          }
          l++;
        }
        if ((r - l) < min) {
          min = r - l;
          minL = l - 1;
          minR = r;
        }
      }
    }

    while (need == have) {
      if (mapT.containsKey(s.charAt(l))) {
        mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);
        if (mapS.get(s.charAt(l)) < mapT.get(s.charAt(l))) {
          have--;
        }
      }
      l++;
    }
    if ((r - l + 1) < min) {
      minL = l - 1;
      minR = r;
    }
    return minR > 0 ? s.substring(minL, minR) : "";
  }

  private int getCountOfCommonElements(Map<Character, Integer> mapT, Map<Character, Integer> mapS) {
    int count = 0;
    for (Map.Entry<Character, Integer> entrySet : mapT.entrySet()) {
      if (mapS.containsKey(entrySet.getKey())) {
        if (mapS.get(entrySet.getKey()) == entrySet.getValue()) {
          count++;
        }
      }
    }
    return count;
  }

  public String minWindowUnoptimized(String s, String t) {
    if (t.length() > s.length()) {
      return "";
    }
    Map<Character, Integer> mapT = new HashMap(26);
    Map<Character, Integer> mapS = new HashMap(26);

    for (int i = 0; i < t.length(); i++) {
      mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
    }
    for (int j = 0; j < t.length(); j++) {
      mapS.put(s.charAt(j), mapS.getOrDefault(s.charAt(j), 0) + 1);
    }

    int l = 0;
    int r = t.length();
    int min = Integer.MAX_VALUE;
    int lastL = 0;
    int lastR = 0;
    while (r < s.length()) {
      if (isSubSet(mapT, mapS)) {
        while (isSubSet(mapT, mapS)) {
          mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);
          l++;
        }
        if (min > ((r - l) + 1)) {
          lastL = l - 1;
          lastR = r - 1;
          min = (r - l) + 1;
        }
      } else {
        mapS.put(s.charAt(r), mapS.getOrDefault(s.charAt(r), 0) + 1);
        r++;
      }
    }
    while (isSubSet(mapT, mapS)) {
      mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);
      l++;
    }
    if (min > ((r - l + 1) + 1)) {
      lastL = l - 1;
      lastR = r;
    }
    return s.substring(lastL, lastR);
  }

  // Is Map T a subset of Map S
  public boolean isSubSet(Map<Character, Integer> mapT, Map<Character, Integer> mapS) {
    if (mapT.size() > mapS.size()) {
      return false;
    }
    for (Map.Entry<Character, Integer> entrySet : mapT.entrySet()) {
      if (mapS.containsKey(entrySet.getKey())) {
        if (mapS.get(entrySet.getKey()) < entrySet.getValue()) {
          return false;
        }
      } else {
        return false;
      }
    }
    return true;
  }
}

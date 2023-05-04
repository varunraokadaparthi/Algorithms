package com.algo.leetcode.arraysandhashing;

import java.beans.Encoder;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

/**
 * https://www.lintcode.com/problem/659/
 * https://leetcode.com/problems/encode-and-decode-strings/
 */
public class EncodeDecodeStrings {


  public String encode(List<String> strs) {
    StringBuilder builder = new StringBuilder();
    strs.forEach(str -> builder.append(str + ":;"));
    return builder.toString();
  }

  public List<String> decode(String str) {
    String[] decodedStrings = str.split(":;");
    return Arrays.asList(decodedStrings);
  }
}

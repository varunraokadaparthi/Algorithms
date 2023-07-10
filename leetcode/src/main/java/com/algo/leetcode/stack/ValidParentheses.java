package com.algo.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 * 20. Valid Parentheses
 */
public class ValidParentheses {

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      switch (c) {
        case ')':
          if (stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
          break;
        case '}':
          if (stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
          break;
        case ']':
          if (stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
          break;
        default:
          stack.push(c);
          break;
      }
    }
    return stack.isEmpty() ? true : false;
  }
}

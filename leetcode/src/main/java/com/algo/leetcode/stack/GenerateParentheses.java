package com.algo.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/generate-parentheses/
 * 22. Generate Parentheses
 */
public class GenerateParentheses {

  private Stack<String> stack = new Stack<>();
  private StringBuilder builder = new StringBuilder();

  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<>();
    int openCount = 0;
    int closedCount = 0;
    backtrack(n, openCount, closedCount, list);
    return list;
  }

  private void backtrackString(int n, int openCount, int closedCount, List<String> list) {
    if (n == openCount && openCount == closedCount) {
      list.add(getString());
      return;
    }
    if (openCount < n) {
      stack.push("(");
      backtrack(n, openCount + 1, closedCount, list);
      stack.pop();
    }
    if (closedCount < openCount) {
      stack.push(")");
      backtrack(n, openCount, closedCount + 1, list);
      stack.pop();
    }
  }

  private void backtrack(int n, int openCount, int closedCount, List<String> list) {
    if (n == openCount && openCount == closedCount) {
      list.add(builder.toString());
      return;
    }
    if (openCount < n) {
      builder.append("(");
      backtrack(n, openCount + 1, closedCount, list);
      builder.deleteCharAt(builder.length() - 1);
    }
    if (closedCount < openCount) {
      builder.append(")");
      backtrack(n, openCount, closedCount + 1, list);
      builder.deleteCharAt(builder.length() - 1);
    }
  }

  public String getString() {
    StringBuilder builder = new StringBuilder();
    Stack<String> tempStack = new Stack<>();
    while (!stack.isEmpty()) {
      tempStack.push(stack.pop());
    }
    while (!tempStack.isEmpty()) {
      builder.append(tempStack.peek());
      stack.push(tempStack.pop());
    }
    return builder.toString();
  }
}

package com.algo.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * 150. Evaluate Reverse Polish Notation
 */
public class EvaluateReversePolishNotation {

  public int evalRPN(String[] tokens) {

    Stack<String> stack = new Stack<>();
    int operand1;
    int operand2;
    for (String s : tokens) {
      switch (s) {
        case "+":
          operand2 = Integer.parseInt(stack.pop());
          operand1 = Integer.parseInt(stack.pop());
          stack.push(String.valueOf(operand1 + operand2));
          break;
        case "-":
          operand2 = Integer.parseInt(stack.pop());
          operand1 = Integer.parseInt(stack.pop());
          stack.push(Integer.toString(operand1 - operand2));
          break;
        case "*":
          operand2 = Integer.parseInt(stack.pop());
          operand1 = Integer.parseInt(stack.pop());
          stack.push(Integer.toString(operand1 * operand2));
          break;
        case "/":
          operand2 = Integer.parseInt(stack.pop());
          operand1 = Integer.parseInt(stack.pop());
          stack.push(Integer.toString(operand1 / operand2));
          break;
        default:
          stack.push(s);
          break;
      }
    }
  return Integer.parseInt(stack.pop());
  }
}

package com.algo.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures/
 * 739. Daily Temperatures
 */
public class DailyTemperatures {

  public int[] dailyTemperaturesNonStack(int[] temperatures) {
    int [] temp = new int[temperatures.length];
    temp[temperatures.length - 1] = 0;
    int count = 0;
    for (int i = temperatures.length - 2; i >= 0; i--) {
      int j = i + 1;
      if (temperatures[j] > temperatures[i]) {
        temp[i] = j;
        count++;
      } else {
        while (j != 0 && temperatures[j] <= temperatures[i]) {
          count++;
          j = temp[j];
        }
        temp[i] = j;
      }
    }
    for (int i = 0; i < temp.length; i++) {
      if (temp[i] > 0) {
        temp[i] = temp[i] - i;
      }
    }
    return temp;
  }

  public int[] dailyTemperaturesStack(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[temperatures.length];
    result[temperatures.length - 1] = 0;
    stack.push(temperatures.length - 1);
    for (int i = temperatures.length - 2; i >= 0; i--) {
      while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        result[i] = 0;
      } else {
        result[i] = stack.peek() - i;
      }
      stack.push(i);
    }
    return result;
  }

  /**
   * Monotonically Decreasing Stack
   * @param temperatures
   * @return
   */
  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[temperatures.length];
    stack.push(0);
    for (int i = 1 ; i < temperatures.length; i++) {
      while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int index = stack.pop();
        result[index] = i - index;
      }
      stack.push(i);
    }
    return result;
  }
}

package com.algo.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

  private MinStack stack = new MinStack();

  @Test
  public void testMinStack() {
    stack.push(-2);
    stack.push(0);
    stack.push(-3);
    assertEquals(-3, stack.getMin());
    stack.pop();
    assertEquals(0, stack.top());
    assertEquals(-2, stack.getMin());
  }

}
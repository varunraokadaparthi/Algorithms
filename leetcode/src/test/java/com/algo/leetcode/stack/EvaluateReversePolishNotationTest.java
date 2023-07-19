package com.algo.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {

  private EvaluateReversePolishNotation notation = new EvaluateReversePolishNotation();

  @Test
  public void testNotation1() {
    String[] tokens = {"2","1","+","3","*"};
    assertEquals(9, notation.evalRPN(tokens));
  }

  @Test
  public void testNotation2() {
    String[] tokens = {"4","13","5","/","+"};
    assertEquals(6, notation.evalRPN(tokens));
  }

  @Test
  public void testNotation3() {
    String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    assertEquals(22, notation.evalRPN(tokens));
  }

}
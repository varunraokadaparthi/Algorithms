package com.algo.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

  private ValidParentheses parentheses = new ValidParentheses();

  @Test
  public void testValidParentheses1() {
    String s = "()";
    assertEquals(true, parentheses.isValid(s));
  }

  @Test
  public void testValidParentheses2() {
    String s = "()[]{}";
    assertEquals(true, parentheses.isValid(s));
  }

  @Test
  public void testValidParentheses3() {
    String s = "(]";
    assertEquals(false, parentheses.isValid(s));
  }

  @Test
  public void testValidParentheses4() {
    String s = "][";
    assertEquals(false, parentheses.isValid(s));
  }

  @Test
  public void testValidParentheses5() {
    String s = "[][[]}";
    assertEquals(false, parentheses.isValid(s));
  }

  @Test
  public void testValidParentheses6() {
    String s = "[";
    assertEquals(false, parentheses.isValid(s));
  }

}
package com.algo.leetcode.stack;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {

  private GenerateParentheses parentheses = new GenerateParentheses();

  @Test
  public void testParenthesis1() {
    int n = 3;
    List<String> expectedOutput = Arrays.asList("((()))","(()())","(())()","()(())","()()()");
    parentheses.generateParenthesis(n).forEach(System.out::println);
    assertArrayList(expectedOutput, parentheses.generateParenthesis(n));

  }

  @Test
  public void testParenthesis2() {
    int n = 1;
    List<String> expectedOutput = Arrays.asList("()");
    assertArrayList(expectedOutput, parentheses.generateParenthesis(n));
  }

  private void assertArrayList(List<String> expectedOutput, List<String> result) {
    assertEquals(expectedOutput.size(), result.size());
    for (int i = 0; i < result.size(); i++) {
      assertEquals(expectedOutput.get(i), result.get(i));
    }
  }

}
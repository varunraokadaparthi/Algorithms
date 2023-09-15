package com.algo.leetcode.dp.twod;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {

  private final UniquePaths paths = new UniquePaths();

  @Test
  public void test1() {
    int m = 3, n = 7;
    assertEquals(28, paths.uniquePaths(m, n));
  }

  @Test
  public void test2() {
    int m = 3, n = 2;
    assertEquals(3, paths.uniquePaths(m, n));
  }

}
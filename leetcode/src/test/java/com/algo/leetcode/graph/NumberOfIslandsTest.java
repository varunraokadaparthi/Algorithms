package com.algo.leetcode.graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfIslandsTest {

  private NumberOfIslands islands = new NumberOfIslands();

  @Test
  public void testNumberOfIslandsTest1() {
    char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}};
    assertEquals(1, islands.numIslands(grid));
  }

  @Test
  public void testNumberOfIslandsTest2() {
    char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}};
    assertEquals(3, islands.numIslands(grid));
  }
}
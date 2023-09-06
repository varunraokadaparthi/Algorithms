package com.algo.leetcode.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPathInBinaryMatrixTest {

  private ShortestPathInBinaryMatrix matrix = new ShortestPathInBinaryMatrix();

  @Test
  public void testShortestPathTest1() {
    int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
    assertEquals(4, matrix.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testShortestPathTest2() {
    int[][] grid = {{0, 1},{1, 0}};
    assertEquals(2, matrix.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testShortestPathTest3() {
    int[][] grid = {{1,0,0},{1,1,0},{1,1,0}};
    assertEquals(-1, matrix.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testShortestPathTest4() {
    int[][] grid = {{0}};
    assertEquals(1, matrix.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testShortestPathTest5() {
    int[][] grid = {{0,1,1,0,0,0},{0,1,0,1,1,0},{0,1,1,0,1,0},{0,0,0,1,1,0},{1,1,1,1,1,0},{1,1,1,1,1,0}};
    assertEquals(14, matrix.shortestPathBinaryMatrix(grid));
  }

}
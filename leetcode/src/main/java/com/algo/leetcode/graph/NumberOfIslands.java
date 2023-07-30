package com.algo.leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/number-of-islands/
 * 200. Number of Islands
 */
public class NumberOfIslands {

  boolean[][] visited;
  private char[][] grid;

  public int numIslands(char[][] grid) {
    this.grid = grid;
    initVisited();

    int islandsCount = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          islandsCount++;
          bfsVisit(i, j);
        }
      }
    }
    return islandsCount;
  }

  private void bfsVisit(int i, int j) {
    visited[i][j] = true;
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(i, j));
    Pair[] directions = new Pair[4];
    directions[0] = new Pair(-1, 0);
    directions[1] = new Pair(0, -1);
    directions[2] = new Pair(+1, 0);
    directions[3] = new Pair(0, +1);

    while (!queue.isEmpty()) {
      Pair pair = queue.remove();
      for (Pair direction : directions) {
        int r = pair.i + direction.i;
        int c = pair.j + direction.j;
        if ((r >= 0 && r < grid.length)
                && (c >= 0 && c < grid[0].length)
                && !visited[r][c]
                && grid[r][c] == '1') {
          visited[r][c] = true;
          queue.add(new Pair(r, c));
        }
      }
    }
  }

  private class Pair {

    int i;
    int j;

    public Pair(int i, int j) {
      this.i = i;
      this.j = j;
    }
  }

  private void dfsVisit(int i, int j) {
    visited[i][j] = true;
    if (grid[i][j] == '0') {
      return;
    }
    if (j + 1 < grid[i].length && !visited[i][j + 1]) {
      dfsVisit(i, j + 1);
    }
    if (i + 1 < grid.length && !visited[i + 1][j]) {
      dfsVisit(i + 1, j);
    }
    if (j - 1 >= 0 && !visited[i][j - 1]) {
      dfsVisit(i, j - 1);
    }
    if (i - 1 >= 0 && !visited[i - 1][j]) {
      dfsVisit(i - 1, j);
    }
  }

  private void initVisited() {
    visited = new boolean[grid.length][];
    for (int i = 0; i < grid.length; i++) {
      visited[i] = new boolean[grid[i].length];
      for (int j = 0; j < grid[i].length; j++) {
        visited[i][j] = false;
      }
    }
  }
}

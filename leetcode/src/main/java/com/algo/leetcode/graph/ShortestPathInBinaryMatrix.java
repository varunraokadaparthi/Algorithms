package com.algo.leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

  public int shortestPathBinaryMatrix(int[][] grid) {

    if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1) {
      return -1;
    }
    boolean[][] visited = new boolean[grid.length][grid.length];
    Queue<Vertex> queue = new LinkedList<>();
    Vertex u = new Vertex(0, 0, 1);
    queue.add(u);
    visited[0][0] = true;

    while (!queue.isEmpty()) {
      u = queue.remove();
      if (u.i == grid.length - 1 && u.j == grid.length - 1) {
        return u.d;
      }
      addChildVertices(u, visited, queue, grid);
    }
    return -1;
  }

  private void addChildVertices(Vertex u, boolean[][] visited, Queue<Vertex> queue, int[][] grid) {
    for (int k = u.i - 1; k <= u.i + 1; k++) {
      for (int l = u.j - 1; l <= u.j + 1; l++) {
        if (!(k < 0 || k >= grid.length || l < 0 || l >= grid.length)) {
          if (!visited[k][l] && grid[k][l] == 0) {
            Vertex v = new Vertex(k, l, u.d + 1);
            queue.add(v);

            visited[k][l] = true;
          }
        }
      }
    }
  }

  public class Vertex {
    int i;
    int j;
    int d;

    public Vertex(int i, int j, int d) {
      this.i = i;
      this.j = j;
      this.d = d;
    }
  }
}

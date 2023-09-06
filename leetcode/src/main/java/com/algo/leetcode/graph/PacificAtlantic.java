package com.algo.leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/pacific-atlantic-water-flow/
 * 417. Pacific Atlantic Water Flow
 */
public class PacificAtlantic {

  public List<List<Integer>> pacificAtlantic(int[][] heights) {

    int m = heights.length;
    int n = heights[0].length;
    boolean[][] pVisited = new boolean[m][n];
    boolean[][] aVisited = new boolean[m][n];
    Queue<List<Integer>> qp = new LinkedList<>();
    Queue<List<Integer>> qa = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      pVisited[i][0] = true;
      aVisited[i][n - 1] = true;
      qp.add(Arrays.asList(i, 0));
      qa.add(Arrays.asList(i, n - 1));
    }
    for (int j = 1; j < n; j++) {
      pVisited[0][j] = true;
      aVisited[m - 1][j - 1] = true;
      qp.add(Arrays.asList(0, j));
      qa.add(Arrays.asList(m - 1, j - 1));
    }

    reachableCells(heights, m, n, qp, pVisited);
    reachableCells(heights, m, n, qa, aVisited);

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (aVisited[i][j] && pVisited[i][j]) {
          result.add(Arrays.asList(i, j));
        }
      }
    }
    return result;
  }

  public void reachableCells(int[][] heights, int m, int n, Queue<List<Integer>> q, boolean[][] visited) {
    List<List<Integer>> directions = Arrays.asList(Arrays.asList(1, 0),
            Arrays.asList(-1, 0),
            Arrays.asList(0, 1),
            Arrays.asList(0, -1));

    while (!q.isEmpty()) {
      List<Integer> cell = q.remove();

      for (List<Integer> direction : directions) {
        int r = cell.get(0);
        int c = cell.get(1);
        int i = direction.get(0);
        int j = direction.get(1);
        if (r + i < 0 || r + i >= m || c + j < 0 || c + j >= n || r < 0 || r >= m || c < 0 || c >= n) {
          continue;
        }
        if (!visited[r + i][c + j] && heights[r + i][c + j] >= heights[r][c]) {
          q.add(Arrays.asList(r + i, c + j));
          visited[r + i][c + j] = true;
        }
      }

    }
  }
}



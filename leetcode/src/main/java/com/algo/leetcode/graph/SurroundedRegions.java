package com.algo.leetcode.graph;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/surrounded-regions/
 * 130. Surrounded Regions
 */
public class SurroundedRegions {

  List<List<Integer>> Directions = initDirection();

  private List<List<Integer>> initDirection() {
    return Arrays.asList(Arrays.asList(1, 0),
            Arrays.asList(-1, 0),
            Arrays.asList(0, 1),
            Arrays.asList(0, -1));
  }

  public void solve(char[][] board) {

    int m = board.length;
    int n = board[0].length;
    boolean[][] visited = new boolean[m][n];

    for (int i = 0; i < m; i++) {
      if (!visited[i][0] && board[i][0] == 'O') {
        dfsRun(board, visited, i, 0);
      }
      if (!visited[i][n - 1] && board[i][n - 1] == 'O') {
        dfsRun(board, visited, i, n - 1);
      }
    }
    for (int i = 1; i < n - 1; i++) {
      if (!visited[0][i] && board[0][i] == 'O') {
        dfsRun(board, visited, 0, i);
      }
      if (!visited[m - 1][i] && board[m - 1][i] == 'O') {
        dfsRun(board, visited, m - 1, i);
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == 'O') {
          board[i][j] = 'X';
        } else if (board[i][j] == 'T') {
          board[i][j] = 'O';
        }
      }
    }
  }

  private void dfsRun(char[][] board, boolean[][] visited, int i, int j) {
    visited[i][j] = true;
    board[i][j] = 'T';
    for (List<Integer> direction : Directions) {
      int r = direction.get(0);
      int c = direction.get(1);
      if (r + i < 0 || r + i >= board.length || c + j < 0 || c + j >= board[0].length) {
        continue;
      }
      if (!visited[r + i][c + j] && board[r + i][c + j] == 'O') {
        dfsRun(board, visited, r + i, c + j);
      }
    }
  }
}

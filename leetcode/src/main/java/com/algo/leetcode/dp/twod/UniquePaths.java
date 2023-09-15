package com.algo.leetcode.dp.twod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/unique-paths/
 * 62. Unique Paths
 */
public class UniquePaths {

  private List<List<Integer>> directions;

  public int uniquePaths(int m, int n) {
    initDirections();
    int[][] cache = new int[m][n];
    Arrays.stream(cache).forEach(i -> Arrays.fill(i, -1));
    return dfs(m, n, 0, 0, cache);
  }

  public int dfs(int m, int n, int i, int j, int[][] cache) {
    if (i >= m || j >= n) {
      return 0;
    }
    if (cache[i][j] != -1) {
      return cache[i][j];
    }
    if (i == m - 1 && j == n - 1) {
      cache[i][j] = 1;
      return 1;
    }
    int count = 0;
    for (List<Integer> direction : directions) {
      count += dfs(m, n, direction.get(0) + i, direction.get(1) + j, cache);
    }
    cache[i][j] = count;
    return count;
  }

  public void initDirections() {
    directions = new ArrayList<>();
    directions.add(Arrays.asList(1, 0));
    directions.add(Arrays.asList(0, 1));
  }
}

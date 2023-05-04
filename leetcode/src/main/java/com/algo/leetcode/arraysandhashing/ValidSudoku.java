package com.algo.leetcode.arraysandhashing;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 * 36. Valid Sudoku
 */
public class ValidSudoku {

  public boolean isValidSudoku(char[][] board) {

    Map<String, Set<Character>> map = new HashMap<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == '.') {
          continue;
        }
        // row sets
        if (map.get("row " + i) != null) {
          if (map.get("row " + i).add(board[i][j]) == false) {
            return false;
          }
        } else {
          HashSet<Character> set = new HashSet();
          set.add(board[i][j]);
          map.put(("row " + i), set);
        }

        // col sets
        if (map.get("col " + j) != null) {
          if (map.get("col " + j).add(board[i][j]) == false) {
            return false;
          }
        } else {
          HashSet<Character> set = new HashSet();
          set.add(board[i][j]);
          map.put(("col " + j), set);
        }

        // 3 x 3 matrix sets
        if (map.get("row " + i / 3 + " col " + j / 3) != null) {
          if (map.get("row " + i / 3 + " col " + j / 3).add(board[i][j]) == false) {
            return false;
          }
        } else {
          HashSet<Character> set = new HashSet();
          set.add(board[i][j]);
          map.put(("row " + i / 3 + " col " + j / 3), set);
        }
      }
    }
    return true;
  }

}

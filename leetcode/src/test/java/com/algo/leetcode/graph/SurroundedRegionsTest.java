package com.algo.leetcode.graph;

import org.junit.Test;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SurroundedRegionsTest {

  private SurroundedRegions regions = new SurroundedRegions();

  @Test
  public void test1() {
    char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
    char[][] expectedOutput = {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
    List<List<Character>> expectedOutputList = Arrays.stream(expectedOutput).map(x -> CharBuffer.wrap(x).chars().mapToObj(ch -> (char)ch).collect(Collectors.toList())).collect(Collectors.toList());
    regions.solve(board);
    List<List<Character>> actualOutputList = Arrays.stream(board).map(x -> CharBuffer.wrap(x).chars().mapToObj(ch -> (char)ch).collect(Collectors.toList())).collect(Collectors.toList());
    assertEquals(expectedOutputList, actualOutputList);

  }

}
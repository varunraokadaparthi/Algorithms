package com.algo.leetcode.graph;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class PacificAtlanticTest {

  private PacificAtlantic atlantic = new PacificAtlantic();

  @Test
  public void test1() {

    int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
    atlantic.pacificAtlantic(heights).forEach(System.out::println);
    Set<List<Integer>> set = atlantic.pacificAtlantic(heights).stream().collect(Collectors.toSet());
    int[][] output = {{0,4},{1,3},{1,4},{2,2},{3,0},{3,1},{4,0}};
    List<List<Integer>> result = Arrays.stream(output).map(i -> Arrays.stream(i).boxed().collect(Collectors.toList())).collect(Collectors.toList());
    assertEquals(true, set.size() == output.length);
    assertEquals(true, result.stream().filter(i -> set.contains(i)).count() == output.length);

  }

  @Test
  public void test2() {

    int[][] heights = {{2, 1}, {1, 2}};
    atlantic.pacificAtlantic(heights).forEach(System.out::println);
    Set<List<Integer>> set = atlantic.pacificAtlantic(heights).stream().collect(Collectors.toSet());
    int[][] output = {{0,1}, {1, 0}, {1, 1}, {0, 0}};
    List<List<Integer>> result = Arrays.stream(output).map(i -> Arrays.stream(i).boxed().collect(Collectors.toList())).collect(Collectors.toList());
    assertEquals(true, set.size() == output.length);
    assertEquals(true, result.stream().filter(i -> set.contains(i)).count() == output.length);

  }
}
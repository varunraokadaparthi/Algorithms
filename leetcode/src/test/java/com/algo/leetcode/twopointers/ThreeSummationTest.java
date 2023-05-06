package com.algo.leetcode.twopointers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Test class for ThreeSummation.
 */
public class ThreeSummationTest {

  private ThreeSummation sum;

  @Before
  public void preSetup() {
    sum = new ThreeSummation();
  }

  @Test
  public void testThreeSummationTest1() {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> list = sum.threeSum(nums);
    int[][] expectedArray = {{-1, -1, 2}, {-1, 0, 1}};
    assertEquals(expectedArray.length, list.size());
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < 3; j++) {
        assertEquals(Optional.of(expectedArray[i][j]).get(), list.get(i).get(j));
      }
    }
  }

  @Test
  public void testThreeSummationTest2() {
    int[] nums = {0, 1, 1};
    List<List<Integer>> list = sum.threeSum(nums);
    int[][] expectedArray = {};
    assertEquals(expectedArray.length, list.size());
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < 3; j++) {
        assertEquals(Optional.of(expectedArray[i][j]).get(), list.get(i).get(j));
      }
    }
  }

  @Test
  public void testThreeSummationTest3() {
    int[] nums = {0, 0, 0};
    List<List<Integer>> list = sum.threeSum(nums);
    int[][] expectedArray = {{0, 0, 0}};
    assertEquals(expectedArray.length, list.size());
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < 3; j++) {
        assertEquals(Optional.of(expectedArray[i][j]).get(), list.get(i).get(j));
      }
    }
  }

  @Test
  public void testThreeSummationTest4() {
    int[] nums = {-2, 0, 0, 2, 2};
    List<List<Integer>> list = sum.threeSum(nums);
    int[][] expectedArray = {{-2, 0, 2 }};
    assertEquals(list.size(), expectedArray.length);
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < 3; j++) {
        assertEquals(Optional.of(expectedArray[i][j]).get(), list.get(i).get(j));
      }
    }
  }
}
package com.algo.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTemperaturesTest {

  private DailyTemperatures temperatures = new DailyTemperatures();

  @Test
  public void testDailyTemperaturesTest1() {
    int[] temps = {73,74,75,71,69,72,76,73};
    int[] expectedOutput = {1,1,4,2,1,1,0,0};
    assertArrayEquals(expectedOutput, temperatures.dailyTemperatures(temps));
  }

  @Test
  public void testDailyTemperaturesTest2() {
    int[] temps = {30,40,50,60};
    int[] expectedOutput = {1,1,1,0};
    assertArrayEquals(expectedOutput, temperatures.dailyTemperatures(temps));
  }

  @Test
  public void testDailyTemperaturesTest3() {
    int[] temps = {30,60,90};
    int[] expectedOutput = {1,1,0};
    assertArrayEquals(expectedOutput, temperatures.dailyTemperatures(temps));
  }

  @Test
  public void testDailyTemperaturesTest4() {
    int[] temps = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] expectedOutput = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    assertArrayEquals(expectedOutput, temperatures.dailyTemperatures(temps));
  }

  @Test
  public void testDailyTemperaturesTest5() {
    int[] temps = {10};
    int[] expectedOutput = {0};
    assertArrayEquals(expectedOutput, temperatures.dailyTemperatures(temps));
  }

  @Test
  public void testDailyTemperaturesTest6() {
    int[] temps = {89,62,70,58,47,47,46,76,100,70};
    int[] expectedOutput = {8,1,5,4,3,2,1,1,0,0};
    assertArrayEquals(expectedOutput, temperatures.dailyTemperatures(temps));
  }

}
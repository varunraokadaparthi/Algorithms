package com.algo.leetcode.dp.oned;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeWaysTest {

  private DecodeWays ways = new DecodeWays();

  @Test
  public void testDecodeWays() {
    String s = "11106";
    assertEquals(2, ways.numDecodings(s));
  }

  @Test
  public void testDecodeWaysTest2() {
    String s = "12";
    assertEquals(2, ways.numDecodings(s));
  }

  @Test
  public void testDecodeWaysTest3() {
    String s = "226";
    assertEquals(3, ways.numDecodings(s));
  }

  @Test
  public void testDecodeWaysTest4() {
    String s = "06";
    assertEquals(0, ways.numDecodings(s));
  }

  @Test
  public void testDecodeWaysTest5() {
    String s = "110";
    assertEquals(1, ways.numDecodings(s));
  }

  @Test
  public void testDecodeWaysTest6() {
    String s = "1123";
    assertEquals(5, ways.numDecodings(s));
  }

}
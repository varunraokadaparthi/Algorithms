package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EncodeDecodeStringsTest {

  private EncodeDecodeStrings encodeDecodeStrings;

  @Before
  public void preSetup() {
    encodeDecodeStrings = new EncodeDecodeStrings();
  }

  @Test
  public void testEncodeDecodeStringsTest1() {
    List<String> list = Arrays.asList("lint", "code", "love", "you");
    String encodedString = encodeDecodeStrings.encode(list);
    List<String> decodedList = encodeDecodeStrings.decode(encodedString);
    assertEquals(list.size(), decodedList.size());
    for (int i = 0; i < list.size(); i++) {
      assertEquals(list.get(i), decodedList.get(i));
    }
  }

  @Test
  public void testEncodeDecodeStringsTest2() {
    List<String> list = Arrays.asList("we", "say", ":", "yes");
    String encodedString = encodeDecodeStrings.encode(list);
    List<String> decodedList = encodeDecodeStrings.decode(encodedString);
    assertEquals(list.size(), decodedList.size());
    for (int i = 0; i < list.size(); i++) {
      assertEquals(list.get(i), decodedList.get(i));
    }
  }

}
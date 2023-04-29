package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

import static org.junit.Assert.*;

/**
 * Test calss for TopKFrequentElements.
 */
public class TopKFrequentElementsTest {

  private TopKFrequentElements elements;

  @Before
  public void preSetup(){
    elements = new TopKFrequentElements();
  }

  @Test
  public void testTopKFrequentElementsTest1() {
    int[] arr = {1,1,1,2,2,3};
    int[] expectedOutput = {1, 2};
    assertArrayEquals(expectedOutput, elements.topKFrequent(arr, 2));
  }

  @Test
  public void testTopKFrequentElementsTest2() {
    int[] arr = {1};
    int[] expectedOutput = {1};
    assertArrayEquals(expectedOutput, elements.topKFrequent(arr, 1));
  }

}
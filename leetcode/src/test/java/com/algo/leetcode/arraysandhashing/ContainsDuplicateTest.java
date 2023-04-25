package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for ContainsDuplicate.
 */
public class ContainsDuplicateTest {

  private ContainsDuplicate duplicate;

  @Before
  public void preSetup() {
    duplicate = new ContainsDuplicate();
  }

  @Test
  public void testContainsDuplicateTrue() {
    int[] arr = {1,2,3,1};
    assertTrue(duplicate.containsDuplicate(arr));
  }

  @Test
  public void testContainsDuplicateFalse() {
    int[] arr = {1,2,3,4};
    assertFalse(duplicate.containsDuplicate(arr));
  }

}
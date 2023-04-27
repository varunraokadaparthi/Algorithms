package com.algo.leetcode.arraysandhashing;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Test class for GroupAnagrams.
 */
public class GroupAnagramsTest {

  private GroupAnagrams anagrams;

  @Before
  public void preSetup() {
    anagrams = new GroupAnagrams();
  }

  @Test
  public void testGroupAnagrams() {
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList("eat", "tea", "ate"));
    expected.add(Arrays.asList("tan", "nat"));
    expected.add(Arrays.asList("bat"));

    List<List<String>> result = anagrams.groupAnagrams(input);

    assertEquals(expected.size(), result.size());

    for (List<String> list : result) {
      assertTrue(expected.contains(list));
    }
  }
}
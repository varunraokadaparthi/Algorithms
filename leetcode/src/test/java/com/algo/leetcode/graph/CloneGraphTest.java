package com.algo.leetcode.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CloneGraphTest {

  private CloneGraph graph = new CloneGraph();
  private CloneGraph.Node node1;

  @Before
  public void preSetup() {
    node1 = new CloneGraph.Node(1);
    CloneGraph.Node node2 = new CloneGraph.Node(2);
    CloneGraph.Node node3 = new CloneGraph.Node(3);

    node1.neighbors.add(node2);
    node1.neighbors.add(node3);
    node2.neighbors.add(node1);
    node2.neighbors.add(node3);
    node3.neighbors.add(node2);
    node3.neighbors.add(node1);
  }

  @Test
  public void testCloneGraph() {
    System.out.println("Original");
    graph.printGraph(node1);
    CloneGraph.Node newNode = graph.cloneGraph(node1);
    System.out.println("New");
    graph.printGraph(newNode);
  }

}
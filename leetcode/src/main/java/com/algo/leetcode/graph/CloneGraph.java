package com.algo.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * https://leetcode.com/problems/clone-graph/
 * 133. Clone Graph
 */
public class CloneGraph {

  public Node cloneGraph(Node node) {

    Node newNode = new Node(node.val);
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    Map<Node, Node> visited = new HashMap<>();
    visited.put(node, newNode);
    while(!queue.isEmpty()) {
      Node current = queue.remove();
      for (Node nNode : current.neighbors) {
        Node newNnode;
        if (!visited.containsKey(nNode)) {
          newNnode = new Node(nNode.val);
          visited.put(nNode, newNnode);
          queue.add(nNode);
        } else {
          newNnode = visited.get(nNode);
        }
        visited.get(current).neighbors.add(newNnode);
      }
    }
    return newNode;
  }

  public void printGraph(Node node) {

    Queue<Node> queue = new LinkedList<>();
    Set<Node> visited = new HashSet<>();
    queue.add(node);

    while (!queue.isEmpty()) {

      Node current = queue.remove();
      if (visited.contains(current)) {
        continue;
      }
      visited.add(current);
      for (Node nNode : current.neighbors) {
        if (!visited.contains(nNode)) {
          queue.add(nNode);
        }
        System.out.println(current.val + " -> " + nNode.val);
      }

    }
  }

  static class Node {

    public int val;
    public List<Node> neighbors;

    public Node() {
      val = 0;
      neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
      val = _val;
      neighbors = _neighbors;
    }
  }
}

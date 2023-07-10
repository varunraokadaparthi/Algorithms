package com.algo.leetcode.stack;

/**
 * https://leetcode.com/problems/min-stack/
 * 155. Min Stack
 *
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {

  private Node head;

  public MinStack() {
    this.head = null;
  }

  public void push(int val) {
    Node node = new Node(val);
    if (head != null) {
      node.min = Math.min(val, head.min);
      node.next = head;
    } else {
      node.min = val;
    }
    head = node;
  }

  public void pop() {
    head = head.next;
  }

  public int top() {
    return this.head.value;
  }

  public int getMin() {
    return this.head.min;
  }

  private boolean isEmpty() {
    return head == null;
  }

  public class Node {
    int value;
    int min;
    Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }
  }
}

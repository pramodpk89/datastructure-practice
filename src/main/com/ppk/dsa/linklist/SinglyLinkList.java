package main.com.ppk.dsa.linklist;

/**
 * Simple linked list implementation
 */
public class SinglyLinkList {

  public SinglyLinkList(int data) {
    this.head = new Node(data);
  }

  Node head;

  /**
   * gets total length of linked list
   * @return
   */
  int size() {
    int currSize = 1;
    Node current = head;
    while (current.next != null) {
      current = current.next;
      currSize += 1;
    }
    return currSize;
  }

  /**
   * appends new node to the tail
   * @param data
   */
  void append(int data) {
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    Node newNode = new Node(data);
    current.next = newNode;
  }

  /**
   * Deletes a node from the list.
   * If the node is head node then sets head as head.next
   * @param val
   */
  void deleteNode(int val) {
    Node current = head;
    if (current.data == val) {
      head = current.next;
      return;
    }
    while (current.next != null) {
      if (current.next.data == val) {
        current.next = current.next.next;
        return;
      }
    }
  }
}

/**
 * Node class
 * holds data and link to next node
 */
class Node {

  public Node(int data) {
    this.data = data;
  }

  int data;
  Node next;
}
package javareview.oop.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javareview.common.Node;

public class LinkedList implements Iterable<Integer> {

  private Node head;
  private Node tail;

  public static LinkedList createEmptyList() {
    return new LinkedList();
  }

  private LinkedList() {
    head = null;
    tail = null;
  }

  public void add(int value) {
    Node node = new Node(value);
    if (tail == null) {
      head = node;
    } else {
      tail.setNext(node);
    }
    tail = node;
  }

  private class ListIterator implements Iterator<Integer> {
    private Node currentNode;

    public ListIterator(Node head) {
      this.currentNode = head;
    }

    @Override
    public boolean hasNext() {
      return currentNode != null;
    }

    @Override
    public Integer next() {
      if (currentNode == null) {
        throw new NoSuchElementException();
      }
      int value = currentNode.getValue();
      currentNode = currentNode.getNext();
      return value;
    }
  }

  @Override
  public Iterator<Integer> iterator() {
    return new ListIterator(head);
  }
}

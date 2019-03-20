package javareview.basic.loop;

import java.util.ArrayList;
import java.util.Arrays;
import javareview.basic.common.Node;
import javareview.basic.recursion.LinkedListCreator;

public class LinkedListDeletor {

  public <T> Node<T> deleteIfEquals(Node<T> head, T value) {
    while (head != null && head.getValue() == value) {
      head = head.getNext();
    }

    if (head == null) {
      return null;
    }

    Node prev = head;
    // Loop invariant: list nodes from head up to prev has been process.
    // (Nodes with values equal to value deleted)
    while (prev.getNext() != null) {
      if (prev.getNext().getValue() == value) {
        // delete it
        prev.setNext(prev.getNext().getNext());
      } else {
        prev = prev.getNext();
      }
    }
    return head;
  }

  public static void main(String[] args) {
    LinkedListCreator creator = new LinkedListCreator();
    LinkedListDeletor deletor = new LinkedListDeletor();

    Node.printLinkedList(
        deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2, 2, 3, 4, 2, 2)), 2));
    Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2)), 2));
    Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(new ArrayList<>()), 2));
    Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2)), 1));
  }
}

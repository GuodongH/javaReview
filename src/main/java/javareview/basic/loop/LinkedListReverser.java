package javareview.basic.loop;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javareview.basic.common.Node;
import javareview.basic.recursion.LinkedListCreator;

public class LinkedListReverser {

  public Node reverseLinkedList(Node head) {
    Node newHead = null;
    Node curHead = head;
    // Loop invariant:
    // newHead points to the linked list already reversed.
    // curHead points to the linked list not yet reversed.
    while (curHead != null) {
      // Loop invariant holds.
      Node next = curHead.getNext();
      curHead.setNext(newHead);
      newHead = curHead;
      curHead = next;
      // Loop invariant holds.
    }
    // Loop invariant holds.
    return newHead;

    // if curHead is last node :
    // next = null
    // curHead.next reversed
    // newHead points to last node
    // curHead = null
  }

  public static void main(String[] args) {
    LinkedListCreator creator = new LinkedListCreator();
    LinkedListReverser reverser = new LinkedListReverser();

    Node.printLinkedList(
        reverser.reverseLinkedList(creator.createLinkedList(new ArrayList<Integer>())));
    Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(2))));
    Node.printLinkedList(
        reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6))));

    Instant start = new Date().toInstant();
    reverser.reverseLinkedList(creator.createLargeLinkedList(1000000));
    Instant end = new Date().toInstant();
    System.out.println("Use " + Duration.between(start, end) + " time");
  }
}

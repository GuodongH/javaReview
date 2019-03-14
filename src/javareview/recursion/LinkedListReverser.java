package javareview.recursion;

public class LinkedListReverser {

  /**
   * Reverses a linked list.
   *
   * @param head the linked list to reserve
   * @return head of the reversed linked list
   */
  public Node reverseLinkedList(Node head) {
    // size == 0
    if (head == null) {
      return null;
    }

    // size == 1
    if (head.getNext() == null) {
      return head;
    }

    Node newHead = reverseLinkedList(head.getNext());
    head.getNext().setNext(head);
    head.setNext(null);
    return newHead;
  }
}

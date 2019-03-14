package javareview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListCreator {

  /**
   * Create a linked list.
   *
   * @param data the data to create the list
   * @return head of the linked list. The returned linked list ends with last node with getNext() ==
   *     null
   */
  public Node createLinkedList(List<Integer> data) {
    if (data.isEmpty()) {
      return null;
    }

    Node firstNode = new Node(data.get(0));
    //    Node headOfSublist = createLinkedList(data.subList(1, data.size()));
    firstNode.setNext(createLinkedList(data.subList(1, data.size())));
    return firstNode;
  }

  public static void main(String[] args) {
    LinkedListCreator creator = new LinkedListCreator();

    Node.printLinkedList(creator.createLinkedList(new ArrayList<Integer>()));
    Node.printLinkedList(creator.createLinkedList(Arrays.asList(1)));
    Node.printLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5)));
  }
}

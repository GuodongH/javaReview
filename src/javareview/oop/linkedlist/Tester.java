package javareview.oop.linkedlist;

public class Tester {

  public static void main(String[] args) {
    LinkedList list = LinkedList.createEmptyList();
    for (int i = 0; i < 100; i++) {
      list.add(i);
    }

    for (Integer value : list) {
      System.out.println(value);
    }
  }
}

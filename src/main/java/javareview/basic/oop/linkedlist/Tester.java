package javareview.basic.oop.linkedlist;

public class Tester {

  public static void main(String[] args) {
    LinkedList<Integer> list = LinkedList.createEmptyList();
    for (int i = 0; i < 100; i++) {
      list.add(i);
    }

    for (Integer value : list) {
      System.out.println(value);
    }

    LinkedList<String> strList = LinkedList.createEmptyList();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < 5; i++) {
      sb.append("a");
      strList.add(sb.toString());
    }

    for (String value : strList) {
      System.out.println(value);
    }
  }
}

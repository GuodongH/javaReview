package javareview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {

  /** Generates all combinations and output them, selecting n elements from data. */
  public void combinations(List<Integer> selected, List<Integer> data, int n) {
    // initial value for recursion
    // how to select element
    // how to output

    if (n == 0) {
      // output all selected elements + empty list
      for (Integer i : selected) {
        System.out.print(i);
        System.out.print(" ");
      }
      System.out.println();
      return;
    }

    if (data.isEmpty()) {
      return;
    }

    // select element 0
    selected.add(data.get(0));
    combinations(selected, data.subList(1, data.size()), n - 1);

    // un-select element 0
    //    selected.remove(data.get(0));
    selected.remove(selected.size() - 1);
    combinations(selected, data.subList(1, data.size()), n);
  }

  public static void main(String[] args) {
    Combinations comb = new Combinations();
    comb.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 2);
    System.out.println("====== list select 2 =========");
    comb.combinations(new ArrayList<>(), Arrays.asList(), 2);
    System.out.println("====== empty list select 2 =========");
    comb.combinations(new ArrayList<>(), Arrays.asList(), 1);
    System.out.println("======= empty list select 1 ========");
    comb.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 1);
    System.out.println("====== list select 1 =========");
    comb.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 0);
    System.out.println("====== list select o =========");
    comb.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4, 5, 6, 7), 5);
    System.out.println("====== list select 5 =========");
  }
}

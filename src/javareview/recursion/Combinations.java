package javareview.recursion;

import java.util.Arrays;
import java.util.List;

public class Combinations {

  /**
   * Generates all combinations and output them, selecting n elements from data.
   *
   * @param data
   * @param n
   */
  public void combinations(List<Integer> data, int n) {
    // initial value for recursion
    // how to select element
    // how to output

    if (data.isEmpty()) {
      if (n == 0) {
        // output empty list
      }
      return;
    }

    if (n < 0) {
      return;
    }

    if (n == 0) {
      // output empty list
      return;
    }

    // select element 0
    combinations(data.subList(1, data.size()), n - 1);

    // un-select element 0
    combinations(data.subList(1, data.size()), n);
  }

  public static void main(String[] args) {
    Combinations comb = new Combinations();
    comb.combinations(Arrays.asList(1, 2, 3, 4), 2);
  }
}

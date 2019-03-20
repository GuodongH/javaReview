package javareview.jdk8.lambda;

import java.util.stream.IntStream;

public class MInDemo {
  public static void main(String[] args) {
    int[] nums = {11, 22, 55, 99, -88, 33, -999};

    int min = Integer.MAX_VALUE;

    for (int i : nums) {
      if (i < min) {
        min = i;
      }
    }

    System.out.println(min);

    // jdk8 lambda
    int minInt = IntStream.of(nums).min().getAsInt();
    System.out.println(minInt);
  }
}

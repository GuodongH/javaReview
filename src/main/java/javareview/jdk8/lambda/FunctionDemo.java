package javareview.jdk8.lambda;

import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class FunctionDemo {

  public static void main(String[] args) {
    // Interface Predicate
    Predicate<Integer> predicate = i -> i > 0;
    System.out.println(predicate.test(-1));

    IntPredicate predicate1 = i -> i > 0;
    System.out.println(predicate1.test(-1));

    // Interface Consumer
    Consumer<String> consumer = s -> System.out.println(s);
    consumer.accept("Input data");
  }
}

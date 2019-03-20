package javareview.jdk8.lambda;

import java.util.function.Consumer;

public class VarDemo {

  public static void main(String[] args) {
    String str = "Test String";
    Consumer<String> consumer = s -> System.out.println(s + str);
    consumer.accept("test...");
  }
}

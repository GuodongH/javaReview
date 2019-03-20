package javareview.jdk8.lambda;

@FunctionalInterface
interface Interface1 {
  int doubleNum(int i);

  /** The most important feature: interface default method: a method with default implementation */
  default int add(int x, int y) {
    x = this.doubleNum(x);
    return x + y;
  }
}

@FunctionalInterface
interface Interface2 {
  int doubleNum(int i);

  default int add(int x, int y) {
    return x + y;
  }
}

@FunctionalInterface
interface interface3 extends Interface1, Interface2 {

  @Override
  default int add(int x, int y) {
    return Interface1.super.add(x, y);
  }
}

public class LambdaDemo1 {
  public static void main(String[] args) {
    Interface1 i1 = (i) -> i * 2;
    Interface1 i3 = (int i) -> i * 2;
    Interface1 i4 =
        i -> {
          System.out.println("=====");
          return i * 2;
        };

    // the most common style
    Interface1 i2 = i -> i * 2;
  }
}

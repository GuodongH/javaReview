package javareview.jdk8.lambda;

@FunctionalInterface
interface IMath {
  int add(int x, int y);
}

@FunctionalInterface
interface IMath2 {
  int sub(int x, int y);
}

public class TypeDemo {

  public static void main(String[] args) {

    IMath lambda = (x, y) -> x + y;
    IMath[] lambdaArray = {(x, y) -> x + y};
    Object lambdaObject = (IMath) (x, y) -> x + y;
    IMath createLambda = createLambda();

    TypeDemo demo = new TypeDemo();
    // use cast
    demo.test((IMath) (x, y) -> x + y);
  }

  public static IMath createLambda() {
    return (x, y) -> x + y;
  }

  public void test(IMath math) {}

  public void test(IMath2 math) {}
}

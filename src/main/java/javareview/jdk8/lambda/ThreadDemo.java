package javareview.jdk8.lambda;

public class ThreadDemo {

  public static void main(String[] args) {
    Runnable target =
        new Runnable() {
          @Override
          public void run() {
            System.out.println("before jdk8 thread");
          }
        };
    new Thread(target).start();

    Object target1 =
        new Runnable() {
          @Override
          public void run() {
            System.out.println("before jdk8 thread use object cast");
          }
        };
    new Thread((Runnable) target1).start();

    // jdk8 lambda
    Runnable target2 = () -> System.out.println("JDK8 lambda thread");
    Object target3 = (Runnable) () -> System.out.println("JDK8 lambda thread use object cast");
    new Thread(target2).start();
    new Thread((Runnable) target3).start();
  }
}

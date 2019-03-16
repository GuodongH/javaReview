package javareview.designpattern.task;

public class Tester {

  public static void main(String[] args) {
    new LoggingRunnable(new TransactionalRunnable(new CodingTask())).run();
    System.out.println(3 | 9);
  }
}

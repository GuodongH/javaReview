package javareview.designpattern.task;

public class CodingTask implements Runnable {

  @Override
  public void run() {
    System.out.println("Writing code");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

package javareview.jdk8.lambda;

import java.text.DecimalFormat;
import java.util.function.Function;

class MyMoney2 {
  private final int money;

  public MyMoney2(int money) {
    this.money = money;
  }

  /** V2 use Function Interface to replace the custom interface */
  public void printMoney(Function<Integer, String> moneyFormat) {
    System.out.println("My saving: " + moneyFormat.apply(this.money));
  }
}

public class MoneyDemoV2 {

  public static void main(String[] args) {

    MyMoney2 money = new MyMoney2(99999999);
    Function<Integer, String> moneyFormat = i -> new DecimalFormat("#,###").format(i);

    // functional interface chain operation
    money.printMoney(moneyFormat.andThen(s -> "CAD " + s));
  }
}

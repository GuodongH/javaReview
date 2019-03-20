package javareview.jdk8.lambda;

import java.text.DecimalFormat;

interface IMoneyFormat {
  String format(int i);
}

class MyMoney {
  private final int money;

  public MyMoney(int money) {
    this.money = money;
  }

  public void printMoney(IMoneyFormat moneyFormat) {
    System.out.println("My saving: " + moneyFormat.format(this.money));
  }
}

public class MoneyDemoV1 {

  public static void main(String[] args) {

    MyMoney money = new MyMoney(99999999);
    money.printMoney(i -> new DecimalFormat("#,###").format(i));
  }
}

package javareview.basic.designpattern.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager implements Role {

  private final List<Employee> reporters;

  public Manager(List<Employee> reporters) {
    this.reporters = Collections.unmodifiableList(new ArrayList<>(reporters));
  }

  @Override
  public void doWork() {
    System.out.println("Dispatching work");
    Employee worker = selectReporter();
    worker.doWork();
  }

  private Employee selectReporter() {
    // select a reporter to do work
    return reporters.get(0);
  }

  private void getStocks() {}

  @Override
  public String toString() {
    return "Manager";
  }
}

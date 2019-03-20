package javareview.jdk8.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

class Dog {
  private String name = "Anita";

  /** default number of dog food */
  private int food = 10;

  /** Static method bark */
  public static void bark(Dog dog) {
    System.out.println(dog + " barked.");
  }

  /**
   * non-static method
   *
   * <p>JDK8 will pass current instance to non-static method, as the first parameter, the parameter
   * name is 'this'.
   *
   * @param num the kg ate
   * @return the remained kg of food
   */
  public int eat(Dog this, int num) {
    System.out.println("Eat " + num + " kg food.");
    this.food -= num;
    return this.food;
  }

  @Override
  public String toString() {
    return this.name;
  }

  public Dog() {}

  /**
   * Constructor with parameter
   *
   * @param name
   */
  public Dog(String name) {
    this.name = name;
  }
}

public class MethodReferenceDemo {

  public static void main(String[] args) {
    // v1: lambda expression
    //    Consumer<String> consumer = s -> System.out.println(s);

    // v2: method reference
    Consumer<String> consumer = System.out::println;
    consumer.accept("Test data");

    Dog dog = new Dog();
    dog.eat(1);

    // static method reference
    // Reference to a static method
    Consumer<Dog> dogConsumer = Dog::bark;
    dogConsumer.accept(dog);

    // non-static method reference, use object instance
    // Reference to an instance method of a particular object
    //    Function<Integer, Integer> function = dog::eat;
    //    UnaryOperator<Integer> function = dog::eat;
    //    System.out.println("Remained " + function.apply(2) + " kg food.");
    IntUnaryOperator function = dog::eat;
    System.out.println("Remained " + function.applyAsInt(2) + " kg food.");

    // non-static method reference, use class name
    // Reference to an instance method of an arbitrary object of a particular type
    BiFunction<Dog, Integer, Integer> eatFunction = Dog::eat;
    System.out.println("Remained " + eatFunction.apply(dog, 2) + " kg food.");

    // Reference to a constructor
    Supplier<Dog> supplier = Dog::new;
    System.out.println("Create a new object: " + supplier.get());

    // Reference to a constructor with parameter
    Function<String, Dog> function1 = Dog::new;
    System.out.println("Create a new object: " + function1.apply("Jerry"));
  }
}

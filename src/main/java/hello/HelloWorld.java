package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("\nThe current local time is: " + currentTime);

    // Create the Greeter
    Greeter greeter = new Greeter();

    // Print message
    System.out.println(greeter.sayHello());
  }
}
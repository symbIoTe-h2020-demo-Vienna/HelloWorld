package hello;

// Import library
import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {

    // Create LocalTime object
    LocalTime currentTime = new LocalTime();

    // Print local time
    System.out.println("\nThe current local time is: " + currentTime);

    // Create the Greeter
    Greeter greeter = new Greeter();

    // Print hello message
    System.out.println(greeter.sayHello());
  }
}
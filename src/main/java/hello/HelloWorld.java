package hello;

import java.time.LocalTime;

/**
 * Created by tony on 17/11/2016.
 */
public class HelloWorld {

    public static void execute(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}

package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @Value("${greeting.user.name}")
    String name;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        LocalTime localTime = LocalTime.now();
        return "Hello World! - " + name + localTime;
    }


    @RequestMapping(value="/valencia", method=RequestMethod.GET)
    Valencia valencia() {
        Valencia valencia = new Valencia();
        return valencia;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}

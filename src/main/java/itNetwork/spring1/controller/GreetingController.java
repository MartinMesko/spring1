package itNetwork.spring1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/vratpozdrav")
    public String sayHello()
    {
        return "Say hello";
    }
}

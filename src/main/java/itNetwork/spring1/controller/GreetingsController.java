package itNetwork.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {
    @GetMapping("/holahola")
    public String index() {
        return "hello-world";
    }
}

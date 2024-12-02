package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    @GetMapping("/hello")
    public String showHelloPage() {
        return "hello"; // This corresponds to a file named "hello.html" in `resources/templates`.
    }
    @GetMapping("/hellokaran")
    public String showHelloPage2() {
        return "hellokaran"; // This corresponds to a file named "hello.html" in `resources/templates`.
    }
}

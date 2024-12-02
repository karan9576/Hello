package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Helloworldcontroller {
    @GetMapping(value="hello")
    public String getMethodName() {
        return "Hello SpringOne!";
    }
    
    
}

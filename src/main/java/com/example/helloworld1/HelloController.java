package com.example.helloworld1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpmc")
public class HelloController {

    @Value("${message}")
    private String message;

    @GetMapping("/hello")
    public String sayHello(){
        return "hello " + message;
    }
}

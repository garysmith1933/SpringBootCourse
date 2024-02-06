package com.example.SpringBootCourse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcome.message}") // works the same as environement variables in javascript.
    private String welcomeMessage;

    @GetMapping("/")
    public String greeting() {
        return welcomeMessage;
    }
}

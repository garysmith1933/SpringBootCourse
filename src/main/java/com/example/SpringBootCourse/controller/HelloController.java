package com.example.SpringBootCourse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public static String greeting() {
        return "Hello my name is Gary";
    }
}

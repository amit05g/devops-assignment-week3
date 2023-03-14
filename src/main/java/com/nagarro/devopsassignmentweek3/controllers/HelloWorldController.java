package com.nagarro.devopsassignmentweek3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
    @GetMapping("/greeting-message")
    public String getMessage() {
        return "Hello World!! Good day!!";
    }
}

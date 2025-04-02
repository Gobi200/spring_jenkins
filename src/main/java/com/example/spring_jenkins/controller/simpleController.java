package com.example.spring_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleController {

    @GetMapping("/sayHello")
    public String SayHello(){
        return "Hello All! Let's kickstart jenkins.";
    }
}

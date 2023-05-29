package com.example.springboottestapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "Hello World!";
    }
    //http://localhost:8080/hello
}
package com.example.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import static java.lang.System.out;

@Controller
public class MyController {
    public String sayHello() {
        out.println("Hello World");
        return "Hi folks";
    }
}

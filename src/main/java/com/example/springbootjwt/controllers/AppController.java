package com.example.springbootjwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/message")
    public String msg() {
        return "Hello Word";
    }
}

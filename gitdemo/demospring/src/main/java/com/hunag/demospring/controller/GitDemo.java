package com.hunag.demospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitDemo {
    @GetMapping("/name")
    public  String  gitDemo(){
        return "你是谁";
    }
}

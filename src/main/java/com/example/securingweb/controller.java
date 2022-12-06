package com.example.securingweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ello")
public class controller {
    @GetMapping("")
    public String hello() {
        return "hello world";
    }

}

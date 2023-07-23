package com.example.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/path-you-are-trying-to-access")
    public String handleRequest() {
        // your logic here
        return "viewName";
    }
}

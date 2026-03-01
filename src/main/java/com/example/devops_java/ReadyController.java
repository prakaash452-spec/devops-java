package com.example.devops_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadyController {
    @GetMapping("/ready")
    public String index() {
        return "Hellow from my new ready controller!";
    }
}
package com.example.devops_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
    @GetMapping("/about")
    public String index() {
        return "This is the pipeline for to  test the CI_CD of Devops application";
    }
}
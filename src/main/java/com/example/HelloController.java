package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "Hello!";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/api/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/api/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}

package com.pablo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Crear proyecto Spring Boot
// Spring Web
// Spring Data JPA
// Endpoint GET /hello

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }    
}

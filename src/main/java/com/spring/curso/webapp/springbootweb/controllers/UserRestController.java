package com.spring.curso.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> getMethodName() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world en spring boot!");
        body.put("name", "Humberto");
        body.put("lastname", "Arellano");

        return body;
    }
}

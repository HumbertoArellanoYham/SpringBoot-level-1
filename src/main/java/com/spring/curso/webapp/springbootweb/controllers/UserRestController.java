package com.spring.curso.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserRestController {

    @GetMapping("")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
}

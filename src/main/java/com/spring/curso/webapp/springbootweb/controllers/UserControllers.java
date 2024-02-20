package com.spring.curso.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControllers {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hello world en spring boot!");
        model.addAttribute("name", "Humberto");
        model.addAttribute("lastname", "Arellano");

        return "details";
    }
}

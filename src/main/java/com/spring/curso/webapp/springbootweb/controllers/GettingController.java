package com.spring.curso.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.curso.webapp.springbootweb.models.Greetting;


@Controller
@RequestMapping("/form")
public class GettingController {


    @GetMapping("/greeting")
    public String greetingForm(Model model) {
      model.addAttribute("greeting", new Greetting());
      return "greeting";
    }
  
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greetting greeting, Model model) {
      model.addAttribute("greeting", greeting);
      return "resultDetails";
    }
    
}

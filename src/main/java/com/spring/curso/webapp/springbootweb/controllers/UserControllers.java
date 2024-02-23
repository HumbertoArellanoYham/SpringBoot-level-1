package com.spring.curso.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.spring.curso.webapp.springbootweb.models.User;

@Controller
public class UserControllers {

    @GetMapping("/")
    public String details(Model model) {
        User user = new User("Humberto", "Arellano");
        user.setEmail("humberto@gmail.com");
        model.addAttribute("title", "Hello world en spring boot!");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");

        return "list";
    }
    
    // ModelAttribute notacion nos sirve para establecer este metodo de manera global y poder 
    // utilizarlo en otros metodos del controlador o en otras vistas 
    @ModelAttribute("user")
    public List<User> listUser(ModelMap model){
            return  Arrays.asList(
                        new User("Carlos", "Garcia", "carlos@email.com"),
                        new User("Ramon", "Doe"),
                        new User("Vanessa", "Doe", "vanessa@email.com"));
    }


}

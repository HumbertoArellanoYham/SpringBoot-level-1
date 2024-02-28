package com.spring.curso.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.spring.curso.webapp.springbootweb.models.User;
import com.spring.curso.webapp.springbootweb.models.dto.ParamDtoOnly;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {
    @GetMapping("/baz/{message}")
    public ParamDtoOnly methodPathVariable(@PathVariable String message) {
        ParamDtoOnly paramDtoOnly = new ParamDtoOnly();        
        paramDtoOnly.setMessage(message);

        return paramDtoOnly;
    }

    @GetMapping("/json/{product}/{id}")
    public Map<String, Object> jsonForProduct(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>(); 
        json.put("product", product);
        json.put("id", id);

        return json;
    }
    
    @PostMapping("/create")
    public User postMethodName(@RequestBody User user) {
        // TODO: process POST request, aqui se obtiene datos del cliente y un ejemplo seria guardarlos en la base de datos

        user.setName(user.getName().toUpperCase());
        
        return user;
    }
    
    
}

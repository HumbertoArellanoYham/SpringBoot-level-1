package com.spring.curso.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.curso.webapp.springbootweb.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamController {
    @GetMapping("/foo")
    public ParamDto messageUrl(@RequestParam(required = false, defaultValue = "Sin mensaje") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }
    
}
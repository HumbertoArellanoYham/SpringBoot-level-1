package com.spring.curso.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.curso.webapp.springbootweb.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import java.util.function.Predicate;

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

    @GetMapping("/bar")
    public ParamDto twoPararamsReturn(@RequestParam String text, @RequestParam Integer code) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(text);
        paramDto.setCode(code);

        return paramDto;
    }
    
    @GetMapping("/request")
    public ParamDto parametrosManeraPrimitiva(HttpServletRequest request) {
        ParamDto paramDto = new ParamDto();

        Integer code = 0;

        try{
            code = Integer.parseInt(request.getParameter("code"));
        } catch(NumberFormatException e){
            // throw new RuntimeException(e);
        }

        paramDto.setCode(code);
        paramDto.setMessage(request.getParameter("message")); 

        return paramDto;
    }
}

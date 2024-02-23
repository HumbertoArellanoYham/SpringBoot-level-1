package com.spring.curso.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.curso.webapp.springbootweb.models.User;
import com.spring.curso.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path="/details")
    public UserDto details(){
        User user = new User("Carlos", "Valenzuela");

        UserDto userDto = new UserDto();
        userDto.setTitle("Hello world en spring boot!");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/list")
    public List<User> userList(){
        User user1 = new User("Carlos","Garcia");
        User user2 = new User("Mario","Doe");
        User user3 = new User("Humberto","Doe");

        return Arrays.asList(user1, user2, user3);
    }

    @GetMapping(path="/details-map")
    public Map<String, Object> getMethodName() {
        User user = new User("Humberto", "Arellano");

        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world en spring boot!");
        body.put("user", user);

        return body;
    }
}

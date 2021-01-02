package com.spring.appuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *Created by olga on 29.12.2020
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private Environment env;

    @GetMapping("/status/check")
    public String status(){
        return "It's working on port " + env.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(){
        return "createUser method is called";
    }
}

package com.spring.appuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *Created by olga on 29.12.2020
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/status/check")
    public String status(){
        return "It's working";
    }
}

package com.jd.spring.demo.annotation.controller;

import com.jd.spring.demo.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void execute(){
        System.out.println("UserController execute...");
        userService.add();
    }
}

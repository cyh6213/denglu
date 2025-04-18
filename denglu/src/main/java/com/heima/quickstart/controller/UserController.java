package com.heima.quickstart.controller;

import com.heima.quickstart.pojo.User;
import com.heima.quickstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String login( User user) {
        return userService.login(user);
    }

}
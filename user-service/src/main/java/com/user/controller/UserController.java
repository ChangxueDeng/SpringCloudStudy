package com.user.controller;

import entity.User;
import com.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid){
        return userService.getUserById(uid);
    }
}

package com.example.springproject.controller;

import com.example.springproject.Service.UserService;
import com.example.springproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /* SAMPLE TEST FOR DEVTOOL CHECKING
    @RequestMapping("/test")     //End point:http://localhost:8080/test
    @ResponseBody //this is used here because we don't have any response body so the return value acts as response
    public String test(){
        int a=10;
        int b=5;
        int c=2;
        return "The sum of a and b is "+(a+b+c);
    }*/


    @Autowired
    UserService userService;
    @GetMapping("/all")
    public Iterable<User> getAll(){
        return userService.getAll();
    }
}

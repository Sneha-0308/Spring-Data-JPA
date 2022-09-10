package com.example.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test")     //End point:http://localhost:8080/test
    @ResponseBody //this is used here because we don't have any response body so the return value acts as response
    public String test(){
        int a=10;
        int b=5;
        int c=2;
        return "The sum of a and b is "+(a+b+c);
    }
}

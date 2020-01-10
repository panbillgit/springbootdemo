package com.example.demo.contorller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RequestMapping("/admin")
public class HelloWordContorller {

    @RequestMapping("login")
    public static String login(){
        return "您好，欢迎来到我的世界。";
    }
}

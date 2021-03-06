package com.example.commentservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

    @Value("${message:NOT CONFIGMAP}")
    private String message;
    @Value("${welcome.message:NOT CONFIGMAP}")
    private String testprop;
    @GetMapping
    public String welcome(){
        System.out.println(message);
        return message;
    }
    @GetMapping("test")
    public String welcomee(){
        System.out.println(message);
        return message;
    }
}

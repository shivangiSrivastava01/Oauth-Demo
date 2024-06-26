package com.myFirst.OauthDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthController {

    @GetMapping("/home")
    public String getHomePage(){
        return "Welcome to Home Page!!!!";
    }

    @GetMapping("/securedLogin")
    public String login(){
        return "Logged In Securely!!!";
    }
}

package com.ev.pcs.fullstack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String BienvenueSpringCode(){
        return "Bienvenue ";
    }
}

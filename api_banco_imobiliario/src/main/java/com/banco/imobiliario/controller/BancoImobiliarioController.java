package com.banco.imobiliario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banco")
public class BancoImobiliarioController {

    @GetMapping
    public String banco(){
        return "Hello World!";
    }
}

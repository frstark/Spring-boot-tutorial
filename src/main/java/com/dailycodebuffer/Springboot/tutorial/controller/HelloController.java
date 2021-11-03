package com.dailycodebuffer.Springboot.tutorial.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")//Wenn der localhost:<port> aufgerufen wird wird die Methode aufgerufen.
    public String helloWorld() {
        return "Willkommen zu Daily Code Buffer!!";
    }
}

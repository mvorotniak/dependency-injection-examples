package com.mvorodeveloper.springframeworkdi.controllers;

import org.springframework.stereotype.Controller;

import com.mvorodeveloper.springframeworkdi.services.GreetingService;

/**
 * Simple Controller stored in the Spring (Application) context as a Bean with name `helloController`
 */
@Controller
public class HelloController {

    private final GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
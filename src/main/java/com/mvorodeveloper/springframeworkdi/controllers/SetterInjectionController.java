package com.mvorodeveloper.springframeworkdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.mvorodeveloper.springframeworkdi.services.GreetingService;

/**
 * Example of Dependency Injection by Setter. Spring Managed Controller
 */
@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    @Qualifier("setterInjectionGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
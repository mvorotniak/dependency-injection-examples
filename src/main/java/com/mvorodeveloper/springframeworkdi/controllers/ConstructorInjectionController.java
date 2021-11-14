package com.mvorodeveloper.springframeworkdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.mvorodeveloper.springframeworkdi.services.GreetingService;

/**
 * Example of Dependency Injection by Constructor. Spring Managed Controller
 */
@Controller
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    // The @Autowired annotation is optional here with the new versions of Spring
    public ConstructorInjectionController(@Qualifier("constructorInjectionGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
package com.mvorodeveloper.springframeworkdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.mvorodeveloper.springframeworkdi.services.GreetingService;

/**
 * Example of Dependency Injection by Class Properties. Spring Managed Controller
 */
@Controller
public class PropertyInjectionController {

    // We marked GreetingServiceImpl with the @Service annotation, so Spring will be able to find an instance of GreetingService
    // in the application context and set it here
    // The @Qualifier annotation tells Spring that we want the PropertyInjectionGreetingService implementation of GreetingService
    @Qualifier("propertyInjectionGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
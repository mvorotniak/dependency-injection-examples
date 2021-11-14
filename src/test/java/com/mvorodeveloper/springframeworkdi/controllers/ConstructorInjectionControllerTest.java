package com.mvorodeveloper.springframeworkdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mvorodeveloper.springframeworkdi.services.PropertyInjectionGreetingService;

/**
 * Test that reflects how Dependency Injection by Constructor works
 */
class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp() {
        constructorInjectionController = new ConstructorInjectionController(new PropertyInjectionGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectionController.getGreeting());
    }
}
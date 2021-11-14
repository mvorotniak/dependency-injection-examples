package com.mvorodeveloper.springframeworkdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mvorodeveloper.springframeworkdi.services.PropertyInjectionGreetingService;

/**
 * Test that reflects how Dependency Injection by Setter works
 */
class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp() {
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new PropertyInjectionGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectionController.getGreeting());
    }
}
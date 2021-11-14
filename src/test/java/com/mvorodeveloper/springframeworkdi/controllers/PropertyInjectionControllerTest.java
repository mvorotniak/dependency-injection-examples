package com.mvorodeveloper.springframeworkdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mvorodeveloper.springframeworkdi.services.PropertyInjectionGreetingService;

/**
 * Test that reflects how Dependency Injection by Class Properties works
 */
class PropertyInjectionControllerTest {

    private PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new PropertyInjectionGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectionController.getGreeting());
    }
}
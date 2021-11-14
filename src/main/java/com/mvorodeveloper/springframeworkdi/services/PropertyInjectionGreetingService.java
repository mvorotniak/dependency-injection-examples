package com.mvorodeveloper.springframeworkdi.services;

import org.springframework.stereotype.Service;

/**
 * Spring Managed component
 */
@Service
public class PropertyInjectionGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property Injected";
    }
}
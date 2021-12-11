package com.mvorodeveloper.springframeworkdi.services;

public class PropertyInjectionGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property Injected";
    }
}
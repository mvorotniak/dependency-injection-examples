package com.mvorodeveloper.springframeworkdi.services;

public class SetterInjectionGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter Injected";
    }
}

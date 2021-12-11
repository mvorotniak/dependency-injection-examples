package com.mvorodeveloper.springframeworkdi.services;

public class ConstructorInjectionGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor Injected";
    }
}

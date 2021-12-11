package com.mvorodeveloper.springframeworkdi.services;

public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Primary Bean";
    }
}

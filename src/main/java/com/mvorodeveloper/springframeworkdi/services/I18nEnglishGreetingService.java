package com.mvorodeveloper.springframeworkdi.services;

/**
 * Internationalization Service for English language
 */
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

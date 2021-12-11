package com.mvorodeveloper.springframeworkdi.services;

/**
 * Internationalization Service for Spanish language
 */
public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

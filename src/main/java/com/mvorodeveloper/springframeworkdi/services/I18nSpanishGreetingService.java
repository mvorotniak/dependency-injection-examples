package com.mvorodeveloper.springframeworkdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Internationalization Service for Spanish language
 */
@Profile("ES")
@Service("I18nGreetingService")
public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

package com.mvorodeveloper.springframeworkdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Internationalization Service for English language
 * This is the default profile if there's no active profile
 */
@Profile({"EN", "default"})
@Service("I18nGreetingService")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

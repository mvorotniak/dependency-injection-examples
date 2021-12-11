package com.mvorodeveloper.springframeworkdi.services;

import com.mvorodeveloper.springframeworkdi.repositories.EnglishGreetingRepository;

/**
 * Internationalization Service for English language
 */
public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}

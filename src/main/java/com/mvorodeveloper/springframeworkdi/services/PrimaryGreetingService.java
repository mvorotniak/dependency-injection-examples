package com.mvorodeveloper.springframeworkdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * This bean should be given preference when multiple candidates are qualified to autowire
 * as it's annotated with the @Primary annotation. It doesn't take advantage to @Qualifier.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Primary Bean";
    }
}

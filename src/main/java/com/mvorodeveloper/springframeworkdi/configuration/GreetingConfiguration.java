package com.mvorodeveloper.springframeworkdi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.mvorodeveloper.springframeworkdi.repositories.EnglishGreetingRepository;
import com.mvorodeveloper.springframeworkdi.repositories.EnglishGreetingRepositoryImpl;
import com.mvorodeveloper.springframeworkdi.services.I18nEnglishGreetingService;
import com.mvorodeveloper.springframeworkdi.services.I18nSpanishGreetingService;
import com.mvorodeveloper.springframeworkdi.services.PrimaryGreetingService;
import com.mvorodeveloper.springframeworkdi.services.PropertyInjectionGreetingService;
import com.mvorodeveloper.springframeworkdi.services.SetterInjectionGreetingService;

/**
 * Spring class based configuration
 */
@ImportResource("classpath:spring-config.xml")
@Configuration
public class GreetingConfiguration {

    @Profile("ES")
    @Bean("i18nGreetingService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

    /**
     * This is the default profile if there's no active profile
     */
    @Profile({"EN", "default"})
    @Bean
    I18nEnglishGreetingService i18nGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    /**
     * This bean should be given preference when multiple candidates are qualified to autowire
     * as it's annotated with the @Primary annotation. It doesn't take advantage to @Qualifier.
     */
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    SetterInjectionGreetingService setterInjectionGreetingService() {
        return new SetterInjectionGreetingService();
    }

    @Bean
    PropertyInjectionGreetingService propertyInjectionGreetingService() {
        return new PropertyInjectionGreetingService();
    }
}

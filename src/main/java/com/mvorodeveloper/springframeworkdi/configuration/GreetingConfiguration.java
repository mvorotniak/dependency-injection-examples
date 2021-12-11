package com.mvorodeveloper.springframeworkdi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mvorodeveloper.springframeworkdi.services.ConstructorInjectionGreetingService;
import com.mvorodeveloper.springframeworkdi.services.PropertyInjectionGreetingService;
import com.mvorodeveloper.springframeworkdi.services.SetterInjectionGreetingService;

/**
 * Spring class based configuration
 */
@Configuration
public class GreetingConfiguration {

    @Bean
    ConstructorInjectionGreetingService constructorInjectionGreetingService() {
        return new ConstructorInjectionGreetingService();
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

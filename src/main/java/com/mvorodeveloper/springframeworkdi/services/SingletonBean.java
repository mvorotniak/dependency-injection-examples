package com.mvorodeveloper.springframeworkdi.services;

import org.springframework.stereotype.Component;

/**
 * Only one instance will be created for a single bean definition per Spring IoC container
 * and the same object will be shared for each request made for that bean.
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean.....");
    }

    public String getBeanScope() {
        return "Singleton Bean Scope";
    }
}

package com.mvorodeveloper.springframeworkdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * A new instance will be created for a single bean definition every time a request is made for that bean.
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating a Prototype bean.....");
    }

    public String getBeanScope() {
        return "Prototype Bean Scope";
    }
}

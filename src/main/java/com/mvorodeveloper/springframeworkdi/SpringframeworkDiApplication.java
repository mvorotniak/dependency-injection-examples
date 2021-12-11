package com.mvorodeveloper.springframeworkdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mvorodeveloper.springframeworkdi.controllers.ConstructorInjectionController;
import com.mvorodeveloper.springframeworkdi.controllers.HelloController;
import com.mvorodeveloper.springframeworkdi.controllers.I18nController;
import com.mvorodeveloper.springframeworkdi.controllers.PropertyInjectionController;
import com.mvorodeveloper.springframeworkdi.controllers.SetterInjectionController;

//@ComponentScan({"com.mvorodeveloper.springframeworkdi", "com.some.package"}) -- example of non-default component scan
@SpringBootApplication
public class SpringframeworkDiApplication {

	public static void main(String[] args) {
		// Get the application context
		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkDiApplication.class, args);

		// The name of the bean is the name of the class but starting with a lowercase
		// Here we're asking the context for the controller (an instance of the class HelloController).
		// There is no need to create a new object. Spring already created one and added it into the Spring Context.
		HelloController controller = (HelloController) applicationContext.getBean("helloController");
		System.out.println(controller.sayHello());

		PropertyInjectionController propertyInjectionController =
			(PropertyInjectionController) applicationContext.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		SetterInjectionController setterInjectionController =
			(SetterInjectionController) applicationContext.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		ConstructorInjectionController constructorInjectionController =
			(ConstructorInjectionController) applicationContext.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreeting());

		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}

}

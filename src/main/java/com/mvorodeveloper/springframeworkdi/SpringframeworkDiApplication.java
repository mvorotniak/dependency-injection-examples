package com.mvorodeveloper.springframeworkdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mvorodeveloper.springframeworkdi.configuration.DatasourceConstructorConfiguration;
import com.mvorodeveloper.springframeworkdi.controllers.ConstructorInjectionController;
import com.mvorodeveloper.springframeworkdi.controllers.HelloController;
import com.mvorodeveloper.springframeworkdi.controllers.I18nController;
import com.mvorodeveloper.springframeworkdi.controllers.PropertyInjectionController;
import com.mvorodeveloper.springframeworkdi.controllers.SetterInjectionController;
import com.mvorodeveloper.springframeworkdi.datasource.FakeDataSource;
import com.mvorodeveloper.springframeworkdi.services.PrototypeBean;
import com.mvorodeveloper.springframeworkdi.services.SingletonBean;

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

		System.out.println("-------Spring Bean Scopes-------");
		// Only one instance of SingletonBean will be created and returned for every request
		SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getBeanScope());
		SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getBeanScope());

		// Every time we request for a bean of type PrototypeBean a new instance will be created and returned
		PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getBeanScope());
		PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getBeanScope());

		System.out.println("-------FakeDataSource-------");
		FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
		System.out.println("FakeDataSource username: " + fakeDataSource.getUsername());
		System.out.println("FakeDataSource password: " + fakeDataSource.getPassword());
		System.out.println("FakeDataSource JDBC url: " + fakeDataSource.getJdbcUrl());

		System.out.println("-------DatasourceConstructorConfiguration-------");
		DatasourceConstructorConfiguration datasourceConstructorConfiguration =
			applicationContext.getBean(DatasourceConstructorConfiguration.class);
		System.out.println("DatasourceConfiguration username: " + datasourceConstructorConfiguration.getUsername());
		System.out.println("DatasourceConfiguration password: " + datasourceConstructorConfiguration.getPassword());
		System.out.println("DatasourceConfiguration JDBC url: " + datasourceConstructorConfiguration.getJdbcUrl());
	}

}

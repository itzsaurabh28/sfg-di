package kumar.saurabh.sfgdi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import kumar.saurabh.sfgdi.controllers.ConstructorInjectedController;
import kumar.saurabh.sfgdi.controllers.I18nController;
import kumar.saurabh.sfgdi.controllers.MyController;
import kumar.saurabh.sfgdi.controllers.PetController;
import kumar.saurabh.sfgdi.controllers.PropertyInjectedController;
import kumar.saurabh.sfgdi.controllers.SetterInjectedController;

/*
 * by default, Spring boot application does component scan in the package containing main class
 * and all its subpackages. If a component in another package, we have to manage that as boot will
 * not automatically pick that up
 * @componentscan(base packages=)should be used here for scanning
 * 
 * but if we are using java configuration using @configuration and @bean, then no need of 
 * stereotype annotation and hence of component scan
 * 
 * to do component scan, spring on startup uses reflection to inspect classes, making it slow
 * 
 */

//@ComponentScan(basePackages = {"kumar.saurabh.sfgdi","kumar.saurabh.pets"}) -- no need as everything is managed in the java config
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		
		//manually creating context and using it for learning process---otherwise can directly be run through command line runner
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		
		
		PetController petController= ctx.getBean("petController", PetController.class);
		//here pets are in different package so conponenet scan was needed
		System.out.println("----the best pet is----");
		System.out.println(petController.whichPetIsTheBest());
		
		//creating bean manually ---spring framework will provide object for MyController
		MyController myController=(MyController)ctx.getBean("myController");
		
		System.out.println("----using primary bean");
		System.out.println(myController.sayHello());
		
		System.out.println("..........bean creation based on profile");
		
		I18nController i18nController=(I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		
		
		System.out.println("..........property based injection");
		
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		
		System.out.println("\n..........setter based injection");
		
		SetterInjectedController setterInjectedController =(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("\n..........constructor based injection");
		ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}

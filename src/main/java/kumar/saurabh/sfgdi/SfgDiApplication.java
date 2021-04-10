package kumar.saurabh.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import kumar.saurabh.sfgdi.controllers.ConstructorInjectedController;
import kumar.saurabh.sfgdi.controllers.MyController;
import kumar.saurabh.sfgdi.controllers.PropertyInjectedController;
import kumar.saurabh.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		
		//manually creating context and using it for learning process
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		
		//creating bean manually ---spring framework will provide object for MyController
		MyController myController=(MyController)ctx.getBean("myController");
		
		System.out.println("----using primary bean");
		System.out.println(myController.sayHello());
		
		
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

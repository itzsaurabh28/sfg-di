package kumar.saurabh.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import kumar.saurabh.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		
		//manually creating context and using it for learning process
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		
		//creating bean manually ---spring framework will provide object for MyController
		MyController myController=(MyController)ctx.getBean("myController");
		
		String greetings=myController.sayHello();
		System.out.println(greetings);
	}

}

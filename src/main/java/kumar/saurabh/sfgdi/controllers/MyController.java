package kumar.saurabh.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import kumar.saurabh.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	
	//no need of autowired in case of constructor injection
	public MyController(GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}



	public String sayHello() {
		
		
		
		return greetingService.sayGreeting();
	}

}

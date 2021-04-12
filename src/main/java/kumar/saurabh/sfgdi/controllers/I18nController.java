package kumar.saurabh.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import kumar.saurabh.sfgdi.services.GreetingService;

@Controller
public class I18nController {
	
	private final GreetingService greetingService;
	
	
	//no need of autowired in case of constructor injection
	public I18nController(@Qualifier("i18nService")   GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}



	public String sayHello() {
		
		
		
		return greetingService.sayGreeting();
	}

}

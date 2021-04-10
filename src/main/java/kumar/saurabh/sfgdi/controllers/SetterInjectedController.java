package kumar.saurabh.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import kumar.saurabh.sfgdi.services.GreetingService;

@Component
public class SetterInjectedController {
	
	@Autowired
	@Qualifier("setterInjectedGreetingService")
	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {

		return greetingService.sayGreeting();
	}

}

package kumar.saurabh.sfgdi.controllers;

import kumar.saurabh.sfgdi.services.GreetingService;

public class PropertyInjectedController {
	
	public GreetingService greetingService;
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}

}

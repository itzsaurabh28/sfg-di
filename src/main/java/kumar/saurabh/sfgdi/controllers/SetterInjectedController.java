package kumar.saurabh.sfgdi.controllers;

import kumar.saurabh.sfgdi.services.GreetingService;

public class SetterInjectedController {

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

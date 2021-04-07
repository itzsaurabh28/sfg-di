package kumar.saurabh.sfgdi.controllers;

import kumar.saurabh.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreeting() {

		return greetingService.sayGreeting();
	}

}

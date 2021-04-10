package kumar.saurabh.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import kumar.saurabh.sfgdi.services.GreetingService;

@Component        //for container to know that this is spring managed component
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	@Autowired // for constructors, autowired is optional from spring 4
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreeting() {

		return greetingService.sayGreeting();
	}

}

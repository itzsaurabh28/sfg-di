package kumar.saurabh.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kumar.saurabh.sfgdi.services.GreetingServiceImpl;
import kumar.saurabh.sfgdi.services.GreetingServiceImplHindi;

class SetterInjectedControllerTest {
	
	SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		
		controller= new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImplHindi());
	}

	@Test
	void testGetGreeting() {
		
		System.out.println(controller.getGreeting());
	}

}

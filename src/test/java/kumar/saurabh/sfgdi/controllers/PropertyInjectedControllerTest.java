package kumar.saurabh.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kumar.saurabh.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		
		controller=new PropertyInjectedController();
		controller.greetingService=new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}

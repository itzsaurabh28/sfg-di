package kumar.saurabh.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kumar.saurabh.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		
		controller=new PropertyInjectedController();
		controller.greetingService=new ConstructorGreetingService();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}

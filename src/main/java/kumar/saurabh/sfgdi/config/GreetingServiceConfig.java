package kumar.saurabh.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kumar.saurabh.sfgdi.services.ConstructorGreetingService;
import kumar.saurabh.sfgdi.services.PropertyInjectedGreetingService;
import kumar.saurabh.sfgdi.services.SetterInjectedGreetingService;

/*
 * Gererally when we own the code, we use spring StreoType, and configuration is needed when
 * using 3rd party apps as the code is not visible to us
 */

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}

	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
}

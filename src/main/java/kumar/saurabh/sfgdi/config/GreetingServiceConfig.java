package kumar.saurabh.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import kumar.saurabh.pets.CatPetService;
import kumar.saurabh.pets.PetService;
import kumar.saurabh.pets.PetServiceFactory;
import kumar.saurabh.sfgdi.repositories.EnglishGreetingRepository;
import kumar.saurabh.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import kumar.saurabh.sfgdi.services.ConstructorGreetingService;
import kumar.saurabh.sfgdi.services.I18nEnglishGreetingService;
import kumar.saurabh.sfgdi.services.I18nSpanishGreetingService;
import kumar.saurabh.sfgdi.services.PrimaryGreetingService;
import kumar.saurabh.sfgdi.services.PropertyInjectedGreetingService;
import kumar.saurabh.sfgdi.services.SetterInjectedGreetingService;

/*
 * Gererally when we own the code, we use spring StreoType, and configuration is needed when
 * using 3rd party apps as the code is not visible to us
 */

@ImportResource("classpath:sfg.di_config.xml") //same could be done on main class
@Configuration
public class GreetingServiceConfig {
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	@Profile({"dog","default"})
	@Bean
	PetService DogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile("cat")
	@Bean
	PetService CatPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}
	
	@Profile({"ES","default"}) 
	@Bean("i18nService")  //by default spring uses method name unless overridden like this
	I18nSpanishGreetingService i18nSpanishGreetingService() { //as the same method name is used below
		
		return new I18nSpanishGreetingService();
		
	}
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		
		return new EnglishGreetingRepositoryImpl();
		
	}
	
	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){ //here method name is choosen based on service name, 
		//same can be provided with bean name
		return new I18nEnglishGreetingService(englishGreetingRepository);
		//creating englishgreetingrepository creates a problem as been needs to created for that
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	//@Bean
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

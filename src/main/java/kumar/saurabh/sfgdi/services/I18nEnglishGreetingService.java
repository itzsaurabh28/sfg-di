package kumar.saurabh.sfgdi.services;

import kumar.saurabh.sfgdi.repositories.EnglishGreetingRepository;

//@Profile("EN")            //spring picks up the profile based on the active profile in the application properties
//@Service("i18nService")   //for spring to pick out this implementation of greeting service
public class I18nEnglishGreetingService implements GreetingService {

//	@Override   trying the way to use DI through java config
//	public String sayGreeting() {
//		return "Hello World!!! --EN";
//	}

	private final EnglishGreetingRepository englishGreetingRepository;

	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {

		this.englishGreetingRepository = englishGreetingRepository;
	}
	
	//creating this constructor requires the changes to be made in the config class
	
	

	@Override
	public String sayGreeting() {
		
		return englishGreetingRepository.getGreeting();
	}

}

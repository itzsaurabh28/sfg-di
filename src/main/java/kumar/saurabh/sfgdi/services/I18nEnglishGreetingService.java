package kumar.saurabh.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("EN")            //spring picks up the profile based on the active profile in the application properties
@Service("i18nService")   //for spring to pick out this implementation of greeting service
public class I18nEnglishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World!!! --EN";
	}

}

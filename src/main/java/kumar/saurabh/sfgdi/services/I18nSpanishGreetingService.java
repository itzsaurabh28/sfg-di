package kumar.saurabh.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"ES","default"})            //when no active profile in properties, default profile is picked
@Service("i18nService")   //for spring to pick out this implementation of greeting service
public class I18nSpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola Mundo!! --ES";
	}

}

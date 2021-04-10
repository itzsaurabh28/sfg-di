package kumar.saurabh.sfgdi.services;

import org.springframework.stereotype.Service;

@Service   //for spring to pick out this implementation of greeting service??
public class SetterInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World!!! --from setter";
	}

}

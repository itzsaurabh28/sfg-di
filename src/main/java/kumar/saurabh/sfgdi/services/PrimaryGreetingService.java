package kumar.saurabh.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service   //for spring to pick out this implementation of greeting service??
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World!!! --from primary";
	}

}

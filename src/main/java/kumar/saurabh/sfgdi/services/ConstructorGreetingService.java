package kumar.saurabh.sfgdi.services;

import org.springframework.stereotype.Service;

//@Service   //for spring to pick out during component scan
//now trying to use java based configuration, so no need of streotype annotation
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World!!! --from constructor";
	}

}

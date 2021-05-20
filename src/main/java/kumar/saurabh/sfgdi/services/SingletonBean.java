package kumar.saurabh.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	
	public SingletonBean() {
		System.out.println("creating a singleton bean-------------------");
	}
	
	public String getMyScope() {
		
		return "I am a singleton!!";
	}

}

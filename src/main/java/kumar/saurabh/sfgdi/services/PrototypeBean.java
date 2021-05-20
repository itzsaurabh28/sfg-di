package kumar.saurabh.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //defining scope
@Component
public class PrototypeBean {
	
	public PrototypeBean() {
		System.out.println("creating a  bean---prototype----------------");
	}
	
	public String getMyScope() {
		
		return "I am a prototype!!";
	}

}

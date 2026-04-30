package beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("bn")
@RequestScoped
public class HolaBean {

	public String getSaludo() {
		return "Hola Mundo Beans, JSF Con Tomcat 10, CDI y Java 17";
	}
}

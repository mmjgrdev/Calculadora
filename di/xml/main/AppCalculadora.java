package di.xml.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.xml.interfaces.ICalculadora;

public class AppCalculadora {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("di/xml/application-context/applicationContext.xml");
		
		ICalculadora icalculadora = context.getBean("mmcalculadora", ICalculadora.class);
		System.out.println(icalculadora.toString());
		
		System.out.println(icalculadora.sumar(5,7));
	}

}

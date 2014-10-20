package org.kalvinhuang.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		
		//find/load SpringConfig.xml
		ApplicationContext context =
			new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		//because scope="prototype", new restaurantBean instance is created each time
		Restaurant restaurantObj1 = (Restaurant) context.getBean ("restaurantBean");
		restaurantObj1.setWelcomeNotes("Object1 is setting welcome note property");
		restaurantObj1.greetCustomer();
		
		Restaurant restaurantObj2 = (Restaurant) context.getBean ("restaurantBean");
		restaurantObj2.greetCustomer();
		
	}
}

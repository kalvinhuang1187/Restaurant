package org.kalvinhuang.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		
		//find/load SpringConfig.xml
		ApplicationContext context =
			new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		//because scope="prototype", new restaurantBean instance is created each time
		Restaurant restaurantObj1 = (Restaurant) context.getBean ("restaurantBean");
		restaurantObj1.greetCustomer();
		
	}
}

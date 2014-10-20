package org.kalvinhuang.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		
		//find/load SpringConfig.xml
		ApplicationContext context =
			new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		//requesting Spring framework to create/return an object called restaurantBean
		//	which will first create a Tea object
		Restaurant restaurantObj = (Restaurant) context.getBean ("restaurantBean");
		
		restaurantObj.prepareHotDrink();
	}
}

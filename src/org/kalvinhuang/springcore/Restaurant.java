package org.kalvinhuang.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean, DisposableBean{
	
	public void greetCustomer() {
		System.out.println("Welcome dear customer!! This is bean life cycle");
	}

	// same thing as init-method and @PostConstruct annotation
	// will call this immediately after initializing restaurantBean
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Restaurant Bean is going through afterPropertiesSet");
	}

	// same thing as destroy-method and @PreDestroy annotation
	// will call this just before restaurantBean's destruction
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Restaurant Bean is destroying now");
	}
	
}

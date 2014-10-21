package org.kalvinhuang.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {
	
	public void greetCustomer() {
		System.out.println("Welcome dear customer!! This is bean life cycle");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Restaurant Bean is going through init.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destory now.");
	}
	
}

package org.kalvinhuang.springcore;

public class Restaurant{
	
	public void greetCustomer() {
		System.out.println("Welcome dear customer!! This is bean life cycle");
	}

	public void init() {
		System.out.println("Bean is giong through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy.");
	}
	
}

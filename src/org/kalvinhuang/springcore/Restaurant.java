package org.kalvinhuang.springcore;

public class Restaurant {
	/*
	public String welcomeNote;
	
	public void setWelcomeNotes(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	*/
	
	public void greetCustomer() {
		System.out.println("Welcome dear customer!! This is bean life cycle");
	}
	
	public void init() {
		System.out.println("Restaurant Bean is going through init.");
	}
	
	public void destroy() {
		System.out.println("Bean will destory now.");
	}
	
}

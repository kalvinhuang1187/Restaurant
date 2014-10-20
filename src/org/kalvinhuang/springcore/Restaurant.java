package org.kalvinhuang.springcore;

public class Restaurant {
	
	public String welcomeNote;
	
	public void setWelcomeNotes(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	
}

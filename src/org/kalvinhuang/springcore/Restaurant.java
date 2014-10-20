package org.kalvinhuang.springcore;

public class Restaurant {
	
	IHotDrink hotDrink;
	
	// not initializing hotDrink interface value with Tea object anywhere
	// At runtime, Spring framework will creating the Tea object and calling 
	//		the Restaurant constructor, passing in the Tea object as a argument
	/*
	Restaurant(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	*/
	
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	
	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
	}
	
}

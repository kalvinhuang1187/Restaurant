package org.kalvinhuang.springcore;

import java.util.List;

public class Restaurant {
	
	private List restaurantWaitersList;
	
	public void setRestaurantWaitersList(List restaurantWaitersList) {
		this.restaurantWaitersList = restaurantWaitersList;
	}
	
	public void displayWaitersNames() {
		System.out.println("All waiters working in Restaurant: " + restaurantWaitersList);
	}
	
	
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

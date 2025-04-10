package com.prowings.patterns.structural.decorator;

public class TestBeverageDecorator {
	
	public static void main(String[] args) {
		
		Beverage order = new EspressoCoffe();
		
		System.out.println("Original Espresso without any addon : "+order.getDescription() + " Rs" + order.cost());
		
		System.out.println("Adding Milk to the order");
		order = new MilkDecorator(order);
		System.out.println("Espresso after addon Milk : "+order.getDescription() + " Rs" + order.cost());
		
		System.out.println("Adding Sugar to the order");
		order = new SugerDecorator(order);
		System.out.println("Espresso after addon Sugar : "+order.getDescription() + " Rs" + order.cost());
		
		System.out.println("Adding Whip/Design to the order");
		order = new DesignDecorator(order);
		System.out.println("Espresso after addon Design : "+order.getDescription() + " Rs" + order.cost());
	}

}

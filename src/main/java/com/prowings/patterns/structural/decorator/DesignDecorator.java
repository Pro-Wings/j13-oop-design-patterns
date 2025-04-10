package com.prowings.patterns.structural.decorator;

public class DesignDecorator extends AddOnDecorator {

	public DesignDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Drwaing Heart Design on Coffee!!";
	}

	@Override
	public double cost() {
		return beverage.cost() + 50;
	}

}

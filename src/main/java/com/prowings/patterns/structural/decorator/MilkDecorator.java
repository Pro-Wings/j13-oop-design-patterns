package com.prowings.patterns.structural.decorator;

public class MilkDecorator extends AddOnDecorator {

	public MilkDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 20;
	}

}

package com.prowings.patterns.structural.decorator;

public class SugerDecorator extends AddOnDecorator {

	public SugerDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Suger";
	}

	@Override
	public double cost() {
		return beverage.cost() + 10;
	}

}

package com.prowings.patterns.structural.decorator;

public abstract class AddOnDecorator implements Beverage{

    protected Beverage beverage;

	public AddOnDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
}

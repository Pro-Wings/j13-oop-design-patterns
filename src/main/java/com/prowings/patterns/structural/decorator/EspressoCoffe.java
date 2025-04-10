package com.prowings.patterns.structural.decorator;

public class EspressoCoffe implements Beverage{
	
	@Override
	public String getDescription() {
		return "Espresso Coffee";
	}

	@Override
	public double cost() {
		return 100.0;
	}

}

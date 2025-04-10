package com.prowings.patterns.creational.abstractfactory;

public class Phone {

	String description;

	public Phone(String model) {
		this.description = model;
	}

	public void getDescription() {
		System.out.println(this.description);
	}

	@Override
	public String toString() {
		return "Phone [description=" + description + "]";
	}

	
}

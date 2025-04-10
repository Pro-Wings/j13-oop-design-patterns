package com.prowings.patterns.creational.singleton;

public class EagerInitializationSingleton {

	private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

	// private constructor to avoid client applications using the constructor
	private EagerInitializationSingleton() {
		System.out.println("EagerInitializationSingleton constructor called");
	}

	
	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}

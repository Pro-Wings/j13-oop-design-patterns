package com.prowings.patterns.creational.singleton;

public enum EnumSingleton {
	
	INSTANCE1,INSTANCE2;
	
	private EnumSingleton() {
		System.out.println("EnumSingleton constructor called");
	}
	
    public static void doSomething() {
        // do something
    }
}

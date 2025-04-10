package com.prowings.patterns.creational.singleton;

public class TestEagerInitializationSingleton {
	
	public static void main(String[] args) {
		
		EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instance2 = EagerInitializationSingleton.getInstance();
		
		System.out.println("instance1 hashCode: " + instance1.hashCode());
		System.out.println("instance2 hashCode: " + instance2.hashCode());
		
		System.out.println("instance1 == instance2: " + (instance1 == instance2));
		
		StaticBlockSingleton instance3 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance4 = StaticBlockSingleton.getInstance();
		
		System.out.println("instance3 == instance4: " + (instance3 == instance4));
	}

}

package com.prowings.patterns.creational.singleton;

public class TestLazyInitializedSingleton {
	
	public static void main(String[] args) {
		
		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
		
		System.out.println("instance1 == instance2: " + (instance1 == instance2));
		
		
	}

}

package com.prowings.patterns.creational.singleton;

public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){
		System.out.println("LazyInitializedSingleton constructor called");
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}

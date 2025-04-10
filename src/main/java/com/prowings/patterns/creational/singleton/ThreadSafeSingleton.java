package com.prowings.patterns.creational.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
		System.out.println("LazyInitializedSingleton constructor called");
    }

//    public static synchronized ThreadSafeSingleton getInstance() {
//        if (instance == null) {
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
}

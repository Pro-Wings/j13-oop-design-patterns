package com.prowings.patterns.creational.singleton;

public class ReflectionSingletonTest {

	public static void main(String[] args) {

		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance2 = null;

		try {
			java.lang.reflect.Constructor[] constructors = LazyInitializedSingleton.class.getDeclaredConstructors();
			for (java.lang.reflect.Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (LazyInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1 == instance2: " + (instance1 == instance2));

	}

}

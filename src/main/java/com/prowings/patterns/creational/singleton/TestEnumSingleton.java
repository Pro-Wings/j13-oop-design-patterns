package com.prowings.patterns.creational.singleton;

public class TestEnumSingleton {
	
	public static void main(String[] args) {
		
		EnumSingleton instance1 = EnumSingleton.INSTANCE1;
		EnumSingleton instance2 = EnumSingleton.INSTANCE1;
		
		System.out.println("instance1 hashCode: " + instance1.hashCode());
		System.out.println("instance2 hashCode: " + instance2.hashCode());
		System.out.println("instance1 == instance2: " + (instance1 == instance2));
		
	}

}

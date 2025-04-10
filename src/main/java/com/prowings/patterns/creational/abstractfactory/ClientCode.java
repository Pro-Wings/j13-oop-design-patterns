package com.prowings.patterns.creational.abstractfactory;

public class ClientCode {
	
	public static void main(String[] args) {
		
		Phone phone = PhoneStore.getPhone("samsung", "Galaxy S22"); 
		
		System.out.println(phone);

		Phone phone2 = PhoneStore.getPhone("apple", "iphone 14 pro max"); 
		
		System.out.println(phone2);
		
	}

}

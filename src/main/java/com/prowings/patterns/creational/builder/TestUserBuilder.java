package com.prowings.patterns.creational.builder;

public class TestUserBuilder {
	
	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder("John", "Doe")
				.age(30)
				.phone("1233555")
				.address("123 Main St, Anytown, USA")
				.build();

		System.out.println(user1);
		
	}

}

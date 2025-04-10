package com.prowings.patterns.creational.builder;

public class TestStudentBuilder {
	
	public static void main(String[] args) {
		
		Student s1 = new Student.StudentBuilder().firstName("John")
				.lastName("Doe")
				.age(30)
				.phone("1233555")
				.address("123 Main St, Anytown, USA")
				.build();
		
		System.out.println(s1);
		
	}

}

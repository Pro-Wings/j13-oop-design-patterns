package com.prowings.patterns.creational.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Student {
	
	private String firstName; //mandatory
	private String lastName; //mandatory
	private int age; //optional
	private String phone; //optional
	private String address; //optional


}

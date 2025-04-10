package com.prowings.patterns.creational.builder;

public class User {
	
	private String firstName; //mandatory
	private String lastName; //mandatory
	private int age; //optional
	private String phone; //optional
	private String address; //optional

	private User(UserBuilder builder)
	{
		this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	public static class UserBuilder{
		private String firstName; //mandatory
		private String lastName; //mandatory
		private int age; //optional
		private String phone; //optional
		private String address; //optional

		//adding constructor for mandatory fields
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		//Return the finally consrcuted User object
		public User build() {
			User user =  new User(this);
			return user;
		}
	}
	
}

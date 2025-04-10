package com.prowings.patterns.creational.abstractfactory;

import java.util.Objects;

public class ApplePhoneFactory {

	private ApplePhoneFactory() {
	}

	public static Phone getPhone(String model) {
		if (model.equalsIgnoreCase("iphone 14"))
			return new Phone("iphone 14");
		else if (model.equalsIgnoreCase("iphone 14 pro"))
			return new Phone("iphone 14 pro");
		else if (model.equalsIgnoreCase("iphone 14 pro max"))
			return new Phone("iphone 14 pro max");

		return new NullPhone();
	}

}

package com.prowings.patterns.creational.abstractfactory;

public class PhoneStore {

	public static Phone getPhone(String brand, String model) {
		if (brand.equalsIgnoreCase("Apple"))
			return ApplePhoneFactory.getPhone(model);
		else if (brand.equalsIgnoreCase("Samsung"))
			return SamsungPhoneFactory.getPhone(model);
		return new NullPhone();
	}

}

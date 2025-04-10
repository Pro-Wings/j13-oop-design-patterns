package com.prowings.patterns.creational.abstractfactory;

import java.util.Objects;

public class SamsungPhoneFactory {

	private SamsungPhoneFactory() {
	}

	public static Phone getPhone(String model) {
		if (model.equalsIgnoreCase("Galaxy S22"))
			return new Phone("Galaxy S22");
		else if (model.equalsIgnoreCase("Galaxy S22 Ultra"))
			return new Phone("Galaxy S22 Ultra");
		else if (model.equalsIgnoreCase("Galaxy S23 Ultra"))
			return new Phone("Galaxy S23 Ultra");

		return new NullPhone();
	}

}

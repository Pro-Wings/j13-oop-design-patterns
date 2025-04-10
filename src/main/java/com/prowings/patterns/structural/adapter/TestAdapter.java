package com.prowings.patterns.structural.adapter;

public class TestAdapter {

	public static void main(String[] args) {

		MicroUSBCharger oldCharger = new MicroUSBCharger();
		TypeCCharger adapter = new MicroUsbToCtypeAdapter(oldCharger);

		Phone phone = new Phone(adapter);
		phone.chargePhone();

	}

}

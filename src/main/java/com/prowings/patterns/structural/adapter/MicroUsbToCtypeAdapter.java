package com.prowings.patterns.structural.adapter;

//Adapter
public class MicroUsbToCtypeAdapter implements TypeCCharger {

	MicroUSBCharger microUSBCharger;
	
	public MicroUsbToCtypeAdapter(MicroUSBCharger microUSBCharger) {
		this.microUSBCharger = microUSBCharger;
	}
	
	
	@Override
	public void chargeWithTypeC() {
		
		 System.out.println("Adapter converting Micro-USB to Type-C...");
	        microUSBCharger.chargeWithMicroUSB();
		
	}
	
	

}

package com.prowings.patterns.structural.adapter;

public class Phone {
	
	 private TypeCCharger charger;

	    public Phone(TypeCCharger charger) {
	        this.charger = charger;
	    }

	    public void chargePhone() {
	        charger.chargeWithTypeC();
	    }

}

package com.prowings.patterns.structural.facade;

public class InventoryService {

	public boolean checkStock(String productId) {
		System.out.println("Checking inventory for product: " + productId);
		return true;
	}

}

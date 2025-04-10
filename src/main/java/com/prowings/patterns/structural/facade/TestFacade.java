package com.prowings.patterns.structural.facade;

public class TestFacade {
	
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder(
            "P123",
            "CreditCard: 1234-xxxx-xxxx-5678",
            "customer@example.com",
            "Mumbai, India",
            "ORD001"
        );
    }

}

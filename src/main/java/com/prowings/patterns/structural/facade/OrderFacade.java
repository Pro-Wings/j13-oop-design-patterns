package com.prowings.patterns.structural.facade;

public class OrderFacade {
	
	
	   private InventoryService inventory = new InventoryService();
	    private PaymentService payment = new PaymentService();
	    private InvoiceService invoice = new InvoiceService();
	    private EmailService email = new EmailService();
	    private ShippingService shipping = new ShippingService();

	    public void placeOrder(String productId, String paymentDetails, String emailId, String address, String orderId) {
	        System.out.println("Starting order placement...");

	        if (inventory.checkStock(productId)) {
	            payment.processPayment(paymentDetails);
	            invoice.generateInvoice(orderId);
	            email.sendConfirmation(emailId);
	            shipping.scheduleDelivery(address);

	            System.out.println("Order placed successfully!");
	        } else {
	            System.out.println("Product out of stock!");
	        }
	    }

}

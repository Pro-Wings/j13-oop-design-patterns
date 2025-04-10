package com.prowings.patterns.structural.facade;

public class EmailService {
	
    public void sendConfirmation(String email) {
        System.out.println("Sending confirmation email to: " + email);
    }

}

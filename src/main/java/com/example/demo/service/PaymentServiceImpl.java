package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment() {
		
		// Payment code

		System.out.println("Payment successful: Amount has been debited from your account.");
		
		System.out.println("Transaction complete: Amount has been credited to the recipient's account.");
		
		
	}

}

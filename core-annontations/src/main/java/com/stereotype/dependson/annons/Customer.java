package com.stereotype.dependson.annons;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	public Customer() {
		System.out.println("Customer()");
	}

}

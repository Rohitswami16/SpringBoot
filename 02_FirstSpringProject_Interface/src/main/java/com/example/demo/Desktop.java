package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	
	String brand = "ASUS";
	String varient = "VIVOBBOK";

	@Override
	public void showDetails() {
		System.out.println(brand + " " + varient);

	}
}

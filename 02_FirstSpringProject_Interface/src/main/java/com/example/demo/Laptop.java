package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

	String brand = "APPLE";
	String varient = "MAC BOOK PRO";

	@Override
	public void showDetails() {

		System.out.println(brand + " " + varient);

	}

}

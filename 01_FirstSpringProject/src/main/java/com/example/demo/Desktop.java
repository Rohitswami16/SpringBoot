package com.example.demo;

import org.springframework.stereotype.Component;

@Component 
public class Desktop {

		String brand = "APPLE";
		String varient = "MACBOOK PRO";
		
		public void showDetails() {
			System.out.println(brand+" "+varient);
		}		
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Student2 {

	Desktop computer;

	public Desktop getComputer() {
		return computer;
	}

	@Autowired
	public void setComputer(Desktop computer) {
		this.computer = computer;
	}
	
	void doProject() {
		System.out.print("STUDENT 2 IS DOING PROJECT USHING ");
		computer.showDetails();
	}
}

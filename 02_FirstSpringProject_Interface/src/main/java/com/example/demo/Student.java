package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	Computer computer;

	public void Student(Computer computer) {
		this.computer = computer;
	}

	void doProject() {
		System.out.println("Student is doing project ushing ");
		computer.showDetails();
	}

}

package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Desktop computer;
	public Student(Desktop computer) {
		this.computer = computer;
	}
	
	void doProject() {
		System.out.print(" STUDENT 1 IS DOING PROJECT USHING ");
		computer.showDetails(); 
	}
}


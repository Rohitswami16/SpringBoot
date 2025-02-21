package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student3 {

	@Autowired
	Desktop computer;
	
	void doProject() {
		System.out.print("STUDENT 3 IS DOING PROJECT USHING ");
		computer.showDetails();
	}
}

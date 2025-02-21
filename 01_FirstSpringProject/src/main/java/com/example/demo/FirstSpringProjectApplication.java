package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		
	ApplicationContext ac =	SpringApplication.run(FirstSpringProjectApplication.class, args);
	
		Student stu = ac.getBean(Student.class);
		stu.doProject();
		
		Student2 stu2 = ac.getBean(Student2.class);
		stu2.doProject();
		
		Student3 stu3 = ac.getBean(Student3.class);
		stu3.doProject();
	}
}

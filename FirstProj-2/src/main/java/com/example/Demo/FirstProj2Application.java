package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication

public class FirstProj2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProj2Application.class, args);
		
		Student s = context.getBean(Student.class);
		
		s.show();
		
	}

}

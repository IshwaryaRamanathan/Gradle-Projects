package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.test.AppConfig;
import com.example.test.Patient;

@SpringBootApplication
public class AssignmentPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentPatientApplication.class, args);
		
		ConfigurableApplicationContext context1=new AnnotationConfigApplicationContext(AppConfig.class);
		Patient p=(Patient) context1.getBean(Patient.class);
		System.out.println("ID : "+p.getPid());
		System.out.println("Name : "+p.getPname());
		context1.close();
	}

}

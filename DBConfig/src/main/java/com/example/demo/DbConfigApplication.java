package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.test.DataBaseConfig;
import com.training.test.EmployeeDAO;

@SpringBootApplication
public class DbConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConfigApplication.class, args);
				
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(DataBaseConfig.class);
		
		EmployeeDAO e=(EmployeeDAO) context.getBean(EmployeeDAO.class);
		System.out.println(" to the database");
		System.out.println(e.getDb().toString());
		context.close();
	}

}

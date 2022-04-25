package com.training.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DataBaseConfig {
	
	@Bean
	public EmployeeDAO employeeDAO()
	{
		EmployeeDAO e = new EmployeeDAO();
		return e;
	}
	
	@Bean
	public DataBaseDAO dataBaseDAO()
	{
		System.out.print("Connected");
		DataBaseDAO db = new DataBaseDAO();
		db.setDrivername("test");
		db.setUrl("jdbc:postgresql://localhost:5432/test");
		db.setUsernmae("postgres");
		db.setPassword("IshK@123");
		return db;
	}
}

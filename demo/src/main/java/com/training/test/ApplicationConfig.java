package com.training.test;

import java.util.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class ApplicationConfig {
	
	@Bean
	public Student student() {
		Student s=new Student();
		s.setRno(103);
		s.setSname("JD");
		
		return s;
	}
	
	@Bean
	public Project project() {
		Project p=new Project();
		Date todayDate = new Date();
		p.setPid(98);
		p.setPname("CAMP");
		p.setSize(3);
		p.setStartDate(todayDate);
		return p;
	}
}

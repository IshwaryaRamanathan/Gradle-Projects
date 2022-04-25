package com.example.demo;
import com.training.test.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hi, Welcome to Spring!");
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Student1 s1=(Student1) context.getBean("st1");
		System.out.println(s1);
		
		Student1 s2=(Student1) context.getBean("st2");
		System.out.println(s2);
		s2.setSname("Kabilan");
		System.out.println(s2);
		
		ConfigurableApplicationContext context1=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student s=(Student) context1.getBean(Student.class);
		System.out.println("ID : "+s.getRno());
		System.out.println("Name : "+s.getSname());
		System.out.println(s.getPobj().toString());
		context1.close();
				
	}

}

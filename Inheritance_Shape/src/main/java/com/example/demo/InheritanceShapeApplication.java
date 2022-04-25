package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.test.Circle;
import com.training.test.Rectangle;
import com.training.test.Square;
import com.training.test.Triangle;

@SpringBootApplication
public class InheritanceShapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InheritanceShapeApplication.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("Shape.xml");
		
		Rectangle r=(Rectangle) con.getBean("Rectangle");
		r.Area();
		r.Perimeter();
		
		Square s=(Square) con.getBean("Square");
		s.Area();
		s.Perimeter();
		
		Triangle t=(Triangle) con.getBean("Triangle");
		t.Area();
		t.Perimeter();
		
		Circle c=(Circle) con.getBean("Circle");
		c.Area();
		c.Perimeter();
	}

}

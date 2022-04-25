package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.test.Product;
import com.example.test.ProductDAO;

@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
		
		ApplicationContext context= new ClassPathXmlApplicationContext("products.xml");
		ProductDAO obj1=(ProductDAO) context.getBean("pdao");
		Product obj2=(Product) context.getBean("Product");
		obj1.addProduct(obj2);
		//context.close();
	}

}

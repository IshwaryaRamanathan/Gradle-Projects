package com.example.demo;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.demo")
@EnableTransactionManagement
@EntityScan(basePackages="com.example.demo")
public class Demo4Application implements CommandLineRunner{
	@Autowired
	ProductService obj;

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product2> list=obj.fetchProductList();
		System.out.println();
		System.out.println(list);
		System.out.println();
		
	}

}

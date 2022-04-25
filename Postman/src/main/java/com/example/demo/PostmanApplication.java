package com.example.demo;

//import com.example.demo.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com.*")
public class PostmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostmanApplication.class, args);
		System.out.println("Hello");
		/*HelloController h = new HelloController();
		System.out.println(h.welcome());*/
	}

}

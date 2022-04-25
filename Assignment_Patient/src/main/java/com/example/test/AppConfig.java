package com.example.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	Patient patient = null;
		
	@Bean
	public Patient patient() {
				
		patient.setPid("P1000");
		patient.setPname("ABC");
		patient.setDisease("fever");
		patient.setGender("female");
		patient.setAdmit_status("yes");
		patient.setAge(55);
		
		return patient;
	}
	
	@Bean
	public PatientService patientservice() {
		
		PatientService patientservice=null;
		//patientservice.p
		return patientservice;
		
	}
	
}

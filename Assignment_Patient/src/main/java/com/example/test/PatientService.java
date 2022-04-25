package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientService {
	
	@Autowired
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public void getPatientDetails() {
		
		
		
		
		String pid=patient.getPid();
		String pname=patient.getPname();
		String disease=patient.getDisease();
		String gender=patient.getGender();
		String admit_status=patient.getAdmit_status();
		int age=patient.getAge();
	}
}

package com.training.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	
	@Autowired
	private DataBaseDAO db;

	public EmployeeDAO() {
		super();
	}
	public EmployeeDAO(DataBaseDAO db) {
		super();
		this.db=db;
	}
	public DataBaseDAO getDb() {
		return db;
	}
	public void setDb(DataBaseDAO db) {
		this.db = db;
	}
	
		
}

package com.training.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int rno;
	private String sname;

	@Autowired
	private Project pobj;
	
	public Student() {
		super();
	}
	
	public Student(int rno, String sname) {
		super();
		this.rno = rno;
		this.sname = sname;
		
	}
	
	public int getRno() {
		return rno;
	}
	
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
			
	public String toString() {
		return "Student [rno="+rno+",sname="+sname+"]\n";
	}

	public Project getPobj() {
		return pobj;
	}

	public void setPobj(Project pobj) {
		this.pobj = pobj;
	}
	
}

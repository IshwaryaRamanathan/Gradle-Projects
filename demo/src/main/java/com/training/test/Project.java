package com.training.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Project {
	private int pid;
	private String pname;
	private Date startDate;
	private int size;
	
	public Project() {
		super();
	}
	
	public Project(int pid, String pname, Date startDate, int size) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.startDate = startDate;
		this.size = size;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return "Student [No="+pid+",Name="+pname+",Date="+sdf.format(startDate)+",Size="+size+"]\n";
	}
}

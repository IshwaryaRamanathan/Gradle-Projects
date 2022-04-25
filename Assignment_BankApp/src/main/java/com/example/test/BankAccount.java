package com.example.test;

public class BankAccount {
	
	private long accountid;
	private String accountholdername;
	private String accounttype;
	private double accountbalance;
	
	public BankAccount(long accountid, String accountholdername, String accounttype, double accountbalance) {
		super();
		this.accountid = accountid;
		this.accountholdername = accountholdername;
		this.accounttype = accounttype;
		this.accountbalance = accountbalance;
	}

	public BankAccount() {}

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

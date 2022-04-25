package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;

interface BackAccountService{
	
	public double withdraw(long accountid,double balance);
	public double deposit(long accountid,double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);
	
}

public class BankAccountServiceImpl implements BackAccountService{

	@Autowired
	BankAccountRepository repo;
	public void setRepo(BankAccountRepository repo) {
		this.repo=repo;
	}
	
	@Override
	public double withdraw(long accountid, double balance) {
		var currbalance=repo.getBalance(accountid);
		if(currbalance>balance) {
			repo.updateBalance(accountid, currbalance-balance);
		}
		return repo.getBalance(accountid);
	}

	@Override
	public double deposit(long accountid, double balance) {
		var currbalance=repo.getBalance(accountid);
		repo.updateBalance(accountid, currbalance+balance);
		return repo.getBalance(accountid);
	}

	@Override
	public double getBalance(long accountId) {
		return repo.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		try {
			var currbalance=repo.getBalance(fromAccount);
			if(currbalance>amount) {
				repo.updateBalance(fromAccount, currbalance-amount);
				var currbalance1=repo.getBalance(toAccount);
				repo.updateBalance(toAccount, currbalance1+amount);
				return true;
			}
		}catch(Exception e) {
			return false;
		}
		return false;
	}

}

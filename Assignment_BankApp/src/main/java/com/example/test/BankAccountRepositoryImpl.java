package com.example.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

interface BankAccountRepository{

	public double getBalance(long accountId);
	public double updateBalance(long accountId,double newBalance);
	
}

public class BankAccountRepositoryImpl implements BankAccountRepository{
	
	@Autowired
	static JdbcTemplate jdbctemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		BankAccountRepositoryImpl.jdbctemplate=jdbctemplate;
	}
	
	@Override
	public double getBalance(long accountId) {
		String SQL_SELECT="select * from bankaccount where accountid="+accountId;
		List<BankAccount> account=jdbctemplate.query(SQL_SELECT, new BeanPropertyRowMapper<BankAccount>(BankAccount.class));
		return account.get(0).getAccountbalance();
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		String SQL_UPDATE="update bankaccount set accountbalance=? where accountid=?";
		return jdbctemplate.update(SQL_UPDATE,newBalance,accountId);
	}
	
}

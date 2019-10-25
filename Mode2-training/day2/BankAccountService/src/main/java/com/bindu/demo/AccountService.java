package com.bindu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {
	
	@Autowired
	AccountRepositry accountRepositry;
	
	public Account findAccountByUserId(int userid) {
		Account account=accountRepositry.findAccountByUserid(userid);
		return account;
	}
	
	public String addAccount(Account account) {
		if (account != null) {
		accountRepositry.save(account);
		return "Account added successfully";
		}
		return "Account Doesnt Exist";
		}

		public String deleteAccount(int accountnum) {
		accountRepositry.deleteById(accountnum);
		return "Account Deleted";
		}
	
	
	

}

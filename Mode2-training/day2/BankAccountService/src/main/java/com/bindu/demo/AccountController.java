package com.bindu.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Account")

public class AccountController {
	
	protected Logger logger = Logger
			.getLogger(AccountController.class.getName());
	
	
	@Autowired
	AccountRepositry accountRepositry;
	
	
	
	@RequestMapping("/{userid}/getAccount")
	public Account byId(@PathVariable("userid") int userid) {
		logger.info("accounts-microservice getUserByUserName() invoked: " + userid);
		Account account = accountRepositry.findAccountByUserid(userid);
		logger.info("accounts-microservice getUserByUserName() found: " + account);
		return account;
	
	}
	
	@RequestMapping("/{accountnum}/getAcc")
	public Account byAccount(@PathVariable("accountnum") int accountnum) {
		logger.info("accounts-microservice getUserByUserName() invoked: " + accountnum);
		Account account = accountRepositry.findAccountByUserid(accountnum);
		logger.info("accounts-microservice getUserByUserName() found: " + account);
		return account;
	
	}
	
	
	@RequestMapping("/add")
	public String addAcc(@RequestBody Account account) {
		accountRepositry.save(account);

	return "account created";
	}

	

	@RequestMapping("/{accountnum}/delete")
	public String deleteAcc(@PathVariable("accountnum") int accountnum) {
		accountRepositry.deleteById(accountnum);
		
	return "account deleted";
	}

		
		
		
		
		
		
		
	
	

}

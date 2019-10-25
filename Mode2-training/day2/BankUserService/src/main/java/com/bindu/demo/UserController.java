package com.bindu.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/User")
public class UserController {
	
	protected Logger logger = Logger
			.getLogger(UserController.class.getName());
	
	
	@Autowired
	UserRepositry userRepositry;
	
	@RequestMapping("/{userName}/user")
	public User byId(@PathVariable("userName") String userName) {
		logger.info("accounts-microservice getUserByUserName() invoked: " + userName);
		User account = userRepositry.getUserByUserName(userName);
		logger.info("accounts-microservice getUserByUserName() found: " + account);
		return account;
	
	}
}

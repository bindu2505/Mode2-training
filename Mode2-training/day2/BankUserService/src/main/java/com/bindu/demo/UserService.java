package com.bindu.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	
	@Autowired
	UserRepositry userRepositry;
	
	public User getUserByUserName(String username) {
		User user=userRepositry.getUserByUserName(username);
		return user;
				
	}

}

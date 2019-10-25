package com.bindu.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepositry extends CrudRepository<User,Integer > {
	
	public User getUserByUserName(String username);

}

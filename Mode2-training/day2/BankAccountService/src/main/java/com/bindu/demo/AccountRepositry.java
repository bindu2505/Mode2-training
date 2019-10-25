package com.bindu.demo;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepositry extends CrudRepository<Account, Integer> {
	
	public Account findAccountByUserid(int userid);
}
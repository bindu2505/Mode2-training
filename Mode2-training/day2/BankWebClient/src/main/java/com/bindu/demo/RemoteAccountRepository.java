package com.bindu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteAccountRepository implements AccountRepository {

	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	

	@Override
	public Account byId(int userid) {
		return restTemplate.getForObject(serviceUrl + "/Accounts/{userid}/getAccount",
				Account.class, userid);
	}
	

	@Override
	public Account byAccount(int accountnum) {
		return restTemplate.getForObject(serviceUrl + "/Accounts/{accountnum}/getAcc",
				Account.class, accountnum);
	}

	@Override
	public String addAcc(Account account) {
		
		 restTemplate.getForObject(serviceUrl + "/Accounts/add",
				Account.class,account);
		 return "account added";
		}

	@Override
	public String deleteAcc(int accountnum) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

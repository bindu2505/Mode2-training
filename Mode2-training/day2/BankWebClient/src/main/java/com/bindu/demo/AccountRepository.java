package com.bindu.demo;


public interface AccountRepository  {
	
	public Account byId(int userid);
	public Account byAccount(int accountnum);
	public String addAcc( Account account);
	public String deleteAcc(int accountnum);
	

}

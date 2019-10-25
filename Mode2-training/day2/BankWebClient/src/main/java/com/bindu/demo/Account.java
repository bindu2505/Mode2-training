package com.bindu.demo;

import java.io.Serializable;


public class Account implements Serializable {
	
	

	private static final long serialVersionUID = 1L;
	private int accountnum;
	private double amount;
	private char accounttype;
	private int userid;

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public char getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(char accounttype) {
		this.accounttype = accounttype;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Account(int accountnum, double amount, char accounttype, int userid) {
		super();
		this.accountnum = accountnum;
		this.amount = amount;
		this.accounttype = accounttype;
		this.userid = userid;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}

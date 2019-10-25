package com.fault;

public class MissingName extends Exception {
	public MissingName(){
		super("Your Name is required..");
	}

}

package com.bindu.samples.java8;

public class MaxLambda {
	public static void main(String[] args) {
		
	
	MaxInterface myInt3=(var1,var2)->{int max=var1>var2?var1:var2;return max;};
	int res3=myInt3.max(15, 7);
	System.out.println(res3);
	}
}

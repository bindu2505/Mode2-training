package com.bindu.fi;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int ans=calculator.calc((x,y)->x+y,10,5);
		System.out.println(ans);
		
		int ans1=calculator.calc((x,y)->x-y,10,5);
		System.out.println(ans1);

		int ans2=calculator.calc((x,y)->x*y,10,5);
		System.out.println(ans2);

	}
}

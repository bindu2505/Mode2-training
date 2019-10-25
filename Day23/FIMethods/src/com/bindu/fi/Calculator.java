package com.bindu.fi;

import java.util.function.BiFunction;

public class Calculator {
 public Integer calc(BiFunction<Integer, Integer, Integer> bi,Integer num1,Integer num2){
	 //bi is the object of interface
	 return bi.apply(num1, num2);
 }
 
 
}

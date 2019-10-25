package com.hcl.demo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Internationalisation {
	public static void main(String[] args) {
	double d=12345.0;
	NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
	NumberFormat nf1=NumberFormat.getInstance(Locale.CHINA);
	NumberFormat nf2=NumberFormat.getInstance(Locale.US);
	System.out.println("Italy representation of " + d+":"+nf.format(d));
	System.out.println("China representation of " + d+":"+nf1.format(d));
	System.out.println("US representation of " + d+":"+nf2.format(d));
	
	
	DateFormat df1=DateFormat.getDateInstance(DateFormat.LONG,new Locale("de","DE"));
	System.out.println("Short format of date:"+df1.format(new Date()));
	
	//DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
	//System.out.println("Medium format of date:"+df2.format(new Date()));

	//DateFormat df3=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	//System.out.println("Long format of date:"+df3.format(new Date()));

}
}

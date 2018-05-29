package com.javaex.api.utility.date;

import java.util.Date;
import java.text.DateFormat;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		System.out.println(now);
		System.out.println(now.toString());
		
		//deprecated (사라질 예정)
		System.out.println(now.toGMTString()); 
		System.out.println(now.toLocaleString());
		now.setDate(-1);
		
		
		//다양한 날짜 표기 형식에 따라 출력
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));

		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(now));

		
	}

}

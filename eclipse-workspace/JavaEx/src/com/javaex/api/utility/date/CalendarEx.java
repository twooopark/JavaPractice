package com.javaex.api.utility.date;

import java.util.*;

public class CalendarEx {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
//		System.out.println(Calendar.YEAR); //1
//		System.out.println(now.YEAR); //1
		System.out.println(now.get(Calendar.YEAR)); //2018 

		
		Calendar custom = Calendar.getInstance();
		
		custom.set(1972, 0, 23); //월은 0부터 시작함
		custom.add(Calendar.YEAR, 50);
		System.out.println(custom.get(Calendar.YEAR));
	
		
		System.out.println(dow);
		
		
		
	}
}

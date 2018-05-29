package com.javaex.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");

//		java.lang.NullPointerException
//		str = null;
//		System.out.println(str.toString());
		
		str = null;
		try {
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println("Null을 참조.");
		}
	}

}

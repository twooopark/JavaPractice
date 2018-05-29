package com.javaex.oop.staticmember;

public class SingletonApp {
	public static void main(String args[]) {
//		Singleton s1 = new Singleton(); //오류 : 생성자 -> private
		Singleton s2 = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}

package com.javaex.oop.staticmember;

public class StaticExApp {
	public static void main(String args[]) {
		StaticEx se = new StaticEx();
		System.out.println("refCount: "+ StaticEx.refCount);
		
		
		StaticEx s1 = new StaticEx();
		System.out.println("refCount: "+ StaticEx.refCount);
		StaticEx s2 = new StaticEx();
		System.out.println("refCount: "+ StaticEx.refCount);

		s1 = null;
		System.out.println("s1 해제 "+ StaticEx.refCount);
		System.out.println("refCount: "+ StaticEx.refCount);
		
		System.gc();
		try {
			Thread.sleep(3000);
			System.out.println("refCount: "+ StaticEx.refCount);
		
		}catch(Exception e) {
			
		}
		
	}
}

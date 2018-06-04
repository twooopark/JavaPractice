package com.javaex.oop.staticmember;

public class StaticExApp {
	public static void main(String args[]) {
		StaticEx se = new StaticEx();
		System.out.println("refCount: "+ StaticEx.refCount);
		
		
		StaticEx s1 = new StaticEx();
		System.out.println("refCount: "+ StaticEx.refCount);
		StaticEx s2 = new StaticEx();
		System.out.println("refCount: "+ StaticEx.refCount);

		//s1이 아직  해제되지 않는다. (GC가 실행되지 않았다. 언제 GC가 실행될지는 JVM이 결정한다.) 
		s1 = null;
		System.out.println("s1 해제 "+ StaticEx.refCount);
		System.out.println("refCount: "+ StaticEx.refCount);
		
		System.gc(); //GC 강제 실행
		try {
			Thread.sleep(3000);
			System.out.println("refCount: "+ StaticEx.refCount);
		
		}catch(Exception e) {
			
		}
		
	}
}

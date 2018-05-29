package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;
	public static String classVar;
	public String instanceVar;
	
	static {
		refCount = 0;
		classVar = "Static Member";
		System.out.println("Static Block, refCount: "+ refCount);
//		instanceVar = "Instance Var";
		//static 블록에서는  static만 접근 가능
	}
	
	public StaticEx() {
		System.out.println("Instance Created, refCount: "+ ++refCount);
	}
	protected void finalize() throws Throwable{
		refCount--;
		super.finalize();
		System.out.println("Finalize Called");
	}
}

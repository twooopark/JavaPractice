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
	// 가비지컬렉터가 메모리를 회수하기 전에 객체에 대해 정리작업을 수행하기 전에 객체에 대해 종료 정리 작업을 수행하기 위해 finalize()호출한다.
	protected void finalize() throws Throwable{
		refCount--;
		super.finalize();
		System.out.println("Finalize Called");
	}
}

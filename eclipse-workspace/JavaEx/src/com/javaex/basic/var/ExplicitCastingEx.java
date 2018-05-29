package com.javaex.basic.var;

public class ExplicitCastingEx {
	public static void main(String[] args){
		byte b;
		int i = 2018;
		float f = 123.456f;
		
//err	b = i;
		b = (byte)i;
		System.out.println("i:"+i);
		System.out.println("b=i, b:"+b);
		i = (int)f;
		System.out.println("f:"+f);
		System.out.println("i=f, i:"+i);
	}
}

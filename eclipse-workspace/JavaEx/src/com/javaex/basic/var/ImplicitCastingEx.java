package com.javaex.basic.var;

public class ImplicitCastingEx {
	public static void main(String[] args){
		byte b = 25; //1byte
		short s = b; //2byte signed
		int i = s;	//4byte
		float f = i; //4byte
		double d = f; //8byte
		char ch = 'A'; //2byte unsigned
//err	short s2 = ch; 
//err	ch = s;
//err	i = f;
		
	}
}

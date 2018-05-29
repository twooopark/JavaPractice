package com.javaex.api.objectclass.ex01;


public class CircleApp {
	public static void main(String[] args){

	Circle ac = new Circle(6,4,7);
	Circle bc = new Circle(2,12,3);
	Circle cc = new Circle(3,3,7);
	Circle dc = cc;
	System.out.println(ac.equals(bc));
	System.out.println(ac.equals(cc));
	System.out.println(ac.equals(dc));
	System.out.println(dc.equals(cc));
	}
}

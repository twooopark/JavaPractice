package com.javaex.api.objectclass.ex01;

public class Point {
	protected int x;
	protected int y;

	public Point(int i, int j) {
		this.x = i;
		this.y = j;
	}
	public String toString() {
		return "x: "+this.x+", y: "+this.y;
	}
//	public void toString() {
//		System.out.println("x: "+x+", y: "+y);
//	}

}

package com.javaex.oop.staticmember;

public class ColorPoint extends Point{
	private String color;

	public ColorPoint() {
		super();
	}
	public ColorPoint(String color) {
		super();
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void draw() {
//		System.out.println(x+", "+y+", "+"color: "+color);
// --> Point의 멤버변수 접근자를 protected 또는 그보다 넓은 제어자로 변경하면 , getX같은 메소드를 불러올 필요가 없음.
		System.out.println(getX()+", "+getY()+", "+"color: "+color);
	}
}

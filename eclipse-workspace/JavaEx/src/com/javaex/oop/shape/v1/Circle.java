package com.javaex.oop.shape.v1;

public class Circle extends Shape{
	protected double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
//		return radius*radius*Math.PI;
		return Math.PI * Math.pow(radius, radius);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("x: "+x+", y: "+y+", area: "+area());
	
	}
	//ObjectClass Overriding
	public boolean equals(Circle c) {
		if(c.radius==this.radius)
			return true;
		else return false;
	}
}

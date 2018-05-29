package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable{
	protected double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
		//return (Math.PI * Math.pow(radius, radius));
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("x: "+x+", y: "+y+", area: "+area());
	
	}

}

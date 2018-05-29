package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
	protected int width;
	protected int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("x: "+x+", y: "+y+", w: "+width+", h: "+height+", area: "+area());
	}

}

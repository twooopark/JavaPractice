package com.javaex.oop.shape.v2;

//여기서 implements Drawable은  Drawable 기능을 구현하라는 표식(?),명령(?)과 같다.
public class Point implements Drawable{
	protected int x;
	protected int y;

	public Point(int i, int j) {
		this.x = i;
		this.y = j;
	}

	@Override
	public void draw() {
		System.out.println("x: "+x+", y: "+y);

	}
}

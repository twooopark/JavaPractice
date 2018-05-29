package com.javaex.oop.shape.v2;

//여기서 implements Drawable은 Drawable 인터페이스를 구현하라는 명령이라고 이해하자.
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

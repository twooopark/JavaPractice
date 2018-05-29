package com.javaex.api.objectclass.ex03;


public class Point implements Cloneable{
	protected int x;
	protected int y;

	public Point(int i, int j) {
		this.x = i;
		this.y = j;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x: "+this.getX()+", y: "+this.getY();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point other = (Point)obj; //다운캐스팅
			return this.x==other.x && this.y==other.y;
		}
		return super.equals(obj); //무슨 의미일까??
	}
	
	
	public Point getClone() {
		Point clone = null;
		try {
			clone =(Point)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	
}

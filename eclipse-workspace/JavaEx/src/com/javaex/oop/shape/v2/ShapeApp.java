package com.javaex.oop.shape.v2;

public class ShapeApp {
	public static void main(String args[]) {
//		Shape s = new Shape(); //추상클래스이므로 생성 X
		Rectangle r = new Rectangle(10,20,100,50);
		r.draw();
		
		Circle c = new Circle(10,10,30);
		c.draw();
		
		Point p = new Point(100,100);
		p.draw();
		
		
		Drawable obj = r;
		if(obj instanceof Drawable) {
			obj.draw(); 
		}
		obj = c;
		if(obj instanceof Drawable) {
			obj.draw(); 
		}
		//보통 if문 보다는 함수로 구현한다고 함.
		printObject(obj);
		// printObject(new Object());
		// 이렇게 해도 인자를 업캐스팅 하려는 과정에서(컴파일 시간에), 오류 여부를 알수 있기 때문이다.		
	}
	public static void printObject(Drawable obj) {
			obj.draw();
	}

}

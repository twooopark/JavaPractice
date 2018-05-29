package com.javaex.api.objectclass.ex03;

public class CloneTest {
	public static void main(String[] args){
		

//		Point p1 = new Point(10, 20);
//		System.out.println("p1="+p1);
//		Point p2 = p1; //p2가 p와 같은 곳을 참조하게 됨
//		p2.setX(3);
//		System.out.println("p2="+p2);// p=x: 3, y: 20
		
//		clone()을 통해 같은 객체를 참조하지 않도록 한다. 
//		Cloneable인터페이스는 아무런 추상메서드를 가지고 있지 않으며,
//		Object클래스의 protected접근자 메서드인 clone의 사용여부만을 결정한다.
//		여기선 clone()을 재정의 하지 않고, getClone()을 만듬..뭐지??
		Point p1 = new Point(10, 20);
		Point p2 = p1.getClone();
		System.out.println("p1="+p1);//p1=x: 10, y: 20
		System.out.println("p2="+p2);//p1=x: 10, y: 20
		
		p2.setX(5);
		p2.setY(8);	
		System.out.println("p1="+p1);//p1=x: 10, y: 20
		System.out.println("p2="+p2);//p2=x: 5, y: 8
		//오류생기는데 원인 못찾음 ㅠㅠ; --> implements Cloneable 안했엇음 ㅠㅠ;
		
		
		//clone()에서 깊은 복사가 필요한 경우!!
		Scoreboard s1 = new Scoreboard(new int[]{10,20,30,40});
		Scoreboard s2= s1.getClone();
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		s2.getScores()[0] = 50;
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		//--> 이것은 s1도 같이 바뀐다. 
		
	}
}

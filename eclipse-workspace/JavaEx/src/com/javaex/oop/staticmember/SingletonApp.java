package com.javaex.oop.staticmember;

// 싱글톤 패턴 : 애플리케이션이 시작될때 어떤 클래스가 최초 한번만 메모리를 할당하고(static), 
// 그 메모리에 인스턴스를 만들어 사용하는 디자인 패턴.
// 1. 메모리 낭비 방지
// 2. 전역 인스턴스로써, 데이터를 공유하기 쉬움
// 3. 너무 다양한 곳에서 사용하면 안된다.(객체 지향 설계 원칙에 어긋남)
public class SingletonApp {
	public static void main(String args[]) {
//		Singleton s1 = new Singleton(); //오류 : 생성자 -> private
		Singleton s2 = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}

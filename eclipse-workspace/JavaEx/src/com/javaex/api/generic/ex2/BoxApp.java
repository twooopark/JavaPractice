package com.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
//		Box intBox = new Box();
		Box<Integer> intBox = new Box<Integer>();
		
		intBox.setContent(123);
//		intBox.setContent("123"); //컴파일시 형식 오류 체크 가능
		

//		int refVal = (int)intBox.getContent();
		int refVal = intBox.getContent(); //형변환 생략가능
		System.out.println(refVal);

//		Box strBox = new Box();
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		System.out.println(strBox.getContent());
		

		//만약 캐스팅이 잘못되었다면??
//		refVal2 = (int)strBox.getContent(); //compile error
		//컴파일 시 체크 가능 -->> 타입 안정성 확보
	}

}

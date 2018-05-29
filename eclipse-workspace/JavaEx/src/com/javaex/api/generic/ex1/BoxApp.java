package com.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		//제네릭을 사용하는 법을 코드로 알아보자
		Box intBox = new Box();
		intBox.setContent(123);
//		int refVal = intBox.getContent();
		int refVal = (int)intBox.getContent();
		System.out.println(refVal);
				
		Box strBox = new Box();
		strBox.setContent("Java");
		String refVal2 = (String)strBox.getContent();
		System.out.println(refVal2);
		
		
		//만약 캐스팅이 잘못되었다면??
//		refVal2 = (int)strBox.getContent(); //runtime error
		//지금 예제에선 int, String을 알고있으므로 다행히 형변환해주었지만
		//어떤 형식의 값이 들어올지 모르는 경우가 있다면, 어떻게 해야할까???? --> generic
		
	}

}

package com.javaex.exception;

import java.io.IOException;

public class ThrowsExcept {
//	2가지 exception 발생시킬 것임.
//	1.강제익셉션 : 컴파일에서 체크
//	2.런타임 : 실행 도중 발생
	
//	이 함수는 IOException을 발생할 수 있습니다.
	public void executeException() throws IOException{
		System.out.println("강제 익셉션 발생");
		throw new IOException("강제 익셉션");
	}
	public void executeRuntimeException() {
		System.out.println("런타임 익셉션 발생");
		throw new RuntimeException("런타임 익셉션");
	}
	//내부에 발생한 예외를 외부에서 처리하도록 위임하는것
	public double divide(int num1, int num2) {
		//함수 내에서 예외가 발생했을 때, 함수 내에서 예외를 처리(리턴값 변경)하여 값을 반환하는 경우
		//반환값이 오류값인지 아닌지 알 수 없는 경우가 생긴다.
//		if(num2 == 0) {
//			System.out.println("0으로 나눌 수 없다.");
//			return 0;
//		}
		if(num2 == 0) {
			throw new ArithmeticException();//예외 처리 위임
		}
		return num1 / num2;
	}
	
}

package com.javaex.exception;

import java.io.IOException;

public class ThrowExceptApp {

	public static void main(String[] args) {
		ThrowsExcept except = new ThrowsExcept();
//		except.executeException(); 
//		--> 컴파일러가 아래와 같이 에러처리 해줘야된다고 표시 됨
		try {
			except.executeException();
		} catch(RuntimeException e) { //사용자 정의 예외처리 만들기 
			System.out.println("Message: "+e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} 
		//내부에 발생한 예외를 외부에서 처리하도록 위임하는 것이 올바른 예외처리이다.
		try {
			System.out.println(except.divide(100,0));
		}catch(ArithmeticException e) {
			System.out.println("0으로 못나눈다니까!");
		}
	}
}

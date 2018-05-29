package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//ArithmeticException Handling
public class ArithExceptionsEx {
	public static void main(String []args) {
		double result = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("함수를 입력하세요. ");
		
		try {
			num = sc.nextInt();
			result = 100/num;
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력 가능합니다.");
		}catch(ArithmeticException e) {
			System.out.println("0은 나눌 수 없습니다.");
		}catch(Exception e) {
			//어떤 에러가 나오는지...
			e.printStackTrace();
		}finally {
			System.out.println("Finally는 예외 발생 여부와 상관없이 무조건 실행되는 문장 (생략가능 )");
		}
		System.out.println(result);
		sc.close();
		
	}

}

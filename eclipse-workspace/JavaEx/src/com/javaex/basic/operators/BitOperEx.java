package com.javaex.basic.operators;

public class BitOperEx {
    public static void main(String[] args){
    	// 비트연산
    	// 하드웨어 제어, 이미지 프로세싱
    	// 미세한 단위 데이터 제어
    	byte b1 = 0b1101;
    	byte b2 = 0b0111;
    	System.out.println(b1&b2);
    	System.out.println(b1|b2);
    	System.out.println(b1^b2);
    	
    	//비트 시프트
    	int val = 1;
    	System.out.println(val);
    	System.out.println(Integer.toBinaryString(val>>2));
    	System.out.println(Integer.toBinaryString(val<<1));
    	System.out.println(Integer.toBinaryString(val<<4));
    	
    	//3항 연산자
    	int a,b;
    	a = 10;
    	b = 30;
    	
    	boolean result;
    	
    	result = a%2==0?true:false;
    	System.out.println(result);
    	
    	String message;
    	int score = 45;
    	
    	message = (score >= 80) ? "good" :
    				(score < 50) ? "fail" : "pass";

    	System.out.println(message);
    }

}

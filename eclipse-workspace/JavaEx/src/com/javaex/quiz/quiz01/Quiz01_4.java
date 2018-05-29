package com.javaex.quiz.quiz01;

public class Quiz01_4 {
    public static void main(String[] args){
    	byte b = 10;
    	char ch = 'A';
    	int i = 100;
    	long l = 1000L;
    	//좁은 범위 >> 넓은 범위의 자료형 변환은 자동 형변환 된다.
    	byte b2 = (byte)i;
    	char ch2 = (char)b;
    	short s = (short)ch;
    	//precision은 당연히 64bit인 long이 더 높다. 
    	//하지만 수의 표현 범위만 봤을 때는 float이 더 넓다. 
    	//따라서 float과 long의 산술 연산은 long이 float으로 
    	//implicit conversion 되어진 후 계산된다.
    	//float.MaxValue ~= 3.402823+e38
    	//long.MaxValue ~= 9.223372+e18
    	float f = l;
    	int i2 = ch;
    }
}

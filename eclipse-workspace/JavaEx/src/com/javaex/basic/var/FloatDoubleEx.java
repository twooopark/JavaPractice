package com.javaex.basic.var;

public class FloatDoubleEx {
    public static void main(String[] args){
    	float floatVar = 3.14159F;
    	double doubleVar = 3.14159;
    	
    	// 정밀도 체크
    	doubleVar = 0.1234567890123456789;
    	floatVar = 0.1234567890123456789F;

    	System.out.println("f: "+floatVar);
    	System.out.println("d: "+doubleVar);
    	//f: 0.12345679
    	//d: 0.12345678901234568
    	
    	//exponent 사용한 표현, 정밀도를 포기하고, 범위를 넓힌다...
    	int intVar = 3*1000000;
    	doubleVar = 3E6; //3 * 10^6
    	floatVar = 3E6F;
    	System.out.println("i: "+intVar);
    	System.out.println("f: "+floatVar);
    	System.out.println("d: "+doubleVar);
    	
    	//부동소수점 계산의 유의점
    	System.out.println("0.1*3: "+0.1*3);
    	
    
    }
}

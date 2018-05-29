package com.practice01;

public class Problem03 {
    public static void main(String[] args){
    	//아래와 같이 구구단을 출력하시오.
    	for(int i=1; i<10; i++) {
    		for(int j=2; j<10; j++) {
    			System.out.print(j+"*"+i+"="+j*i+"\t");
    		}
    		System.out.println("");
    	}
    }
}

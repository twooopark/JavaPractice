package com.practice02;

public class Problem01 {
    public static void main(String[] args){
    	//다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하시오.
    	int n = 3;
	    int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
	    System.out.println("주어진 배열에서 "+n+"의 배수의 개수=>"+countMultiple(data,n));
	    System.out.println("주어진 배열에서 "+n+"의 배수의 합=>"+sumMultiple(data,n));
	    
    }
    public static int countMultiple(int[] data, int n) {
    	int result = 0;
    	for(int i=0; i<data.length; i++) {
    		if( data[i]%n == 0 )
    			result++;
    	}
    	return result;
    }
    public static int sumMultiple(int[] data, int n) {
    	int result = 0;
    	for(int i=0; i<data.length; i++) {
    		if( data[i]%n == 0 )
    			result += data[i];
    	}
    	return result;
    }
}

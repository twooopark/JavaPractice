package com.practice02;

public class Problem04 {
    public static void main(String[] args){
    	int range = 45;
    	int number[] = new int[6];
    	int n;
    	for(int i=0; i<6; i++) {
    		n = (int)(Math.random()*range)+1;
    		for(int j=0; j<i; j++) {
    			if(number[j] == n) {
//    				System.out.println("중복! "+"i:"+i+",j:"+j+"|"+number[j]+","+n);
    	    		n = (int)(Math.random()*range)+1;
    				j=-1;
//    				System.out.println("중복제거");
    	    		
    			}
    		}
    		number[i] = n;
    	}
    	for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+"\t");
    	}
    }
}

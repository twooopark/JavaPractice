package com.javaex.quiz.quiz02;

public class Quiz02_1 {
    public static void main(String[] args){
    	int a = 3;
    	int b = 6;
    	char c = 'A';
    	
    	System.out.println(a%2==0?true:false);
    	System.out.println(b%3==0?true:false);
    	boolean r1 = (a%2==0?true:false) & (b%3==0?true:false);
    	System.out.println(r1);
    	int r2 = c+4;
    	System.out.println((char)r2);
    	
    	
    	
    }
}


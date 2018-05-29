package com.practice01;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args){
    	//숫자의 입력을 받아 피라미드처럼 출력하시오.
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();  
    	for(int i=1; i<=n; i++) {
    		for(int j=0; j<i; j++) {
    			System.out.print(i);
    		}
    		System.out.println("");
    	}
    }
}

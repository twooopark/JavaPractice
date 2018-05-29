package com.practice01;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args){
    	//정수 5개를 입력받아 가장 큰 수를 출력하시오.
		System.out.print("숫자를 입력하시오.\n");
    	Scanner sc = new Scanner(System.in);
    	int max = 0;
    	int n ;
    	for(int i=0; i<5; i++) {
    		System.out.print("숫자: ");
        	n = sc.nextInt();  
        	max = max < n? n : max;
    	}
		System.out.print("최대값은 "+max+"입니다.");
    }
}

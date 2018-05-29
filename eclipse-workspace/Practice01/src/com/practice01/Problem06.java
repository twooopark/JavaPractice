package com.practice01;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args){
    	//입력 받은 숫자가 홀/짝인 경우에는, 입력 값까지 홀/짝수의 합을 출력하시오.
    	Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.\n");
    	int n = sc.nextInt();
    	int sum = 0;
    	for(int i=1; i<=n; i++) {
    		if(i%2==n%2)sum+=i;
    	}
    	System.out.println("결과값: "+sum);
    }
}

package com.practice02;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args){
    	int num = 5;
    	Scanner sc = new Scanner(System.in);
    	int[] arr = new int[num];
    	int sum = 0;
    	for(int i=0; i<num; i++) {
    		arr[i] = sc.nextInt();
    		sum += arr[i];
    	}
    	System.out.println("평균은 "+sum/(float)num+" 입니다");
    }
}

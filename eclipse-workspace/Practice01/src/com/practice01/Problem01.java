package com.practice01;

public class Problem01 {
    public static void main(String[] args){
	//1부터 100까지의 수에서 5의 배수이면서, 7의 배수인 수를 출력
	for(int i=1;i<100;i++)
		if(i%5==0 && i%7==0)
			System.out.println(i);
    }
}

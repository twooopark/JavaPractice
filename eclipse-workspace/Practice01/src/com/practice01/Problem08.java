package com.practice01;
import java.util.*;

public class Problem08 {
    public static void main(String[] args){
    	int num = 0;
		int sel;
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.print("1.예금 | 2.출금  | 3.잔고  | 4.종료\n");
    		System.out.print("선택>");
        	sel = sc.nextInt();
        	
        	switch(sel) {
        	case 1:
	    		System.out.print("에금액>");
	        	num += sc.nextInt();
        		break;
        	case 2:
	    		System.out.print("출금액>");
	        	num -= sc.nextInt();
        		break;
        	case 3:
	    		System.out.println("잔고액>"+num);
        		break;
        	case 4:
	    		System.out.println("프로그램 종료");
	    		System.exit(0);
        		break;
        	default :
	    		System.out.println("다시 입력하시오.");
        		break;
        	}
    	}
    }
}

package com.practice01;
import java.util.*;

public class Problem07 {
    public static void main(String[] args){
    	int num = 0;
		int inum;
		String s;
    	Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 게임 시작\n");
			num = (int)(Math.random()*100)+1;
			
			
	    	while(true) {
	    		System.out.print(">>");
	        	inum = sc.nextInt();
	        	if(inum == num) {
	        		break;
	        	}
	        	else if(inum > num) {
		    		System.out.print("더 낮게");	        		
	        	}
	        	else {
		    		System.out.print("더 높게");	        		
	        	}
	    	}

			System.out.print("맞았습니다.\n게임을 종료하시겠습니까?(y/n) ");
    		System.out.print(">>");
        	s = sc.next();
    		if(s.charAt(0) == 'y') {
    			System.out.print("숫자 게임 종료\n");
    			break;
    		}
		}
    }
}

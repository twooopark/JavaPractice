package com.practice02;

public class Problem05 {
    public static void main(String[] args){
    	int scoreboard[][] = {
    			{ 80, 75, 90, 95, 78 },
    			{ 92, 88, 89, 92, 70 },
    			{ 78, 80, 85, 86, 63 },
    			{ 83, 84, 89, 87, 75 },
    			{ 89, 83, 93, 94, 78 }
    	};
		int sum = 0, cnt = 0, score = 85;
    	for(int i=0; i<scoreboard.length; i++) {
    		for(int j=0; j<scoreboard[i].length; j++) {
    			if(score <= scoreboard[i][j]) {
    				sum += scoreboard[i][j];
    				cnt++;
    			}
    		}
    	}
    	System.out.println(sum);
		System.out.println(sum/(float)cnt);
    }
}

package com.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Deque;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
    	int N, M = 0;
    	int[][] datas = new int[201][201];
    	String s = new String();
    	StringBuilder sb = new StringBuilder();
		StringTokenizer st;
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
    	//N = Integer.parseInt(br.readLine());
		//st = new StringTokenizer(br.readLine());
    	//N = Integer.parseInt(st.nextToken());
    	//M = Integer.parseInt(st.nextToken());
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	
    }
}

class Monkey {
	public void mHorse(int[][] datas, int x, int y){
		int tmp = datas[x][y];
		
	}
	public void mMonkey() {
		
	}
}
0 0 0 0 1 0 0 0 1 1 0 0
1 0 0 0 0 1 0 1 0 0 0 1
0 0 1 0 0 0 1 0 1 1 0 1
0 1 0 0 0 1 1 0 0 0 0 0 
0 1 1 1 0 0 0 1 1 0 1 0
0 0 1 1 0 1 0 0 1 0 1 0 
1 1 1 0 1 0 0 1 0 1 0 0
if(K==1) {
	//말의 이동법
	x = 0, y = 0;
	if(datas[y][x]==1) return -1;
	
	if(datas[y][x+1]+datas[y][x+2]+datas[y+1][x+2] == 0)
	{
		x += 2, y += 1;
		move++;
	}	
	else if(datas[y+1][x]+datas[y+2][x]+datas[y+2][x+1] == 0)
	{
		x += 1, y += 2;
		move++;
	}... 8가지?
}
else if(K>1) {
	
}
else {
	
}

/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Deque;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
    	int N, M = 0;
    	int[][] datas;
    	String s = new String();
    	StringBuilder sb = new StringBuilder();
		StringTokenizer st;
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
    	//N = Integer.parseInt(br.readLine());
		//st = new StringTokenizer(br.readLine());
    	//N = Integer.parseInt(st.nextToken());
    	//M = Integer.parseInt(st.nextToken());
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	
    	}
    	System.out.println(M);
    }
}
*/
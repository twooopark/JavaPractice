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
    static int[] D = new int[1000005];
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
    	Dp(N);
    	System.out.println(D[N]);
    	
    }
    public static int Dp(int n) {
    	int X = 1000000, Y = 1000000;
    	if(n == 1) 
    		return 0;
    	if(D[n] != 0) 
    		return D[n];
    	if(n%3==0)
    		X = Dp(n/3)+1;
    	if(n%2==0)
    		Y = Dp(n/2)+1;
		return D[n] = Math.min(Math.min(X,Y), Dp(n-1)+1);
    }
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
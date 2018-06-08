package com.backjoon.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = 0;
        int N = 0;
        
        while ( N <= M || M > 10000 || N > 10000) {
            M = sc.nextInt();
            N = sc.nextInt();
        }
        
        int sum = 0;
        int min = 0;
        int first = 0;
        
        boolean isPrime = true;
        
        if ( M == 1 ){
            M = 2;
        }
    
        for( int i = M; i <= N; i++ ){
            for ( int j = 2; j < i; j++) { //소수 찾기
                if( i == 2 ) {
                    min = 2;
                    sum += 2;
                    first = 1;
                    break;
                }
                
                if ( i%j == 0 ){
                    isPrime = false;
                    break;
                }
                
                else {
                    isPrime = true;
                }
                
            }
            
            if ( isPrime && first == 0 ) { //최소값
                min = i;
                sum += i;
                first = 1;
            }
            
            else if( isPrime ){ //소수들의 합
                sum += i;
            }
        }
        
        if ( min == 0 ){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
 
//Scanner sc = new Scanner(System.in);
//
//int T = sc.nextInt();  sc.nextLine();
//String[] s = sc.nextLine().trim().split(" ");
//for(int i = 0; i < T; i++) {
//	int inNum = Integer.parseInt(s[i]);
//	if(inNum < 0)
//		Card[Math.abs(inNum)][0]++;
//	else
//		Card[inNum][1]++;
//}
//int M = sc.nextInt();
//String rs = "";
//for(int i = 0; i < M; i++) {
//	int inNum = sc.nextInt();
//	if(inNum < 0)
//		rs += Card[Math.abs(inNum)][0]+" ";
//	else
//		rs += Card[inNum][1]+" ";
//}
//sc.nextLine();
//System.out.println(rs.trim());

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
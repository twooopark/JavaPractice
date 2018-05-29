package com.javaex.thread.ex01;


public class MainThread {
	public static void main (String args[]) {
	
		Thread th = new DigitThread();
		
		th.start();		
		
		for(char ch= 'A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.javaex.thread.ex02;

//Thread 클래스를 이용
public class MainThread {
	public static void main (String args[]) {
	
		Thread th = new DigitThread();
		
		th.start();
		
		
//		for(char ch= 'A'; ch<='Z'; ch++) {
//			System.out.println(ch);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		Thread thread2 = new AlphabetThread();
		thread2.start();
		
		//th와 thread2를 main쓰레드의 흐름에 합류
		//--> 쓰레드의 동작이 끝나기 전까지, 메인쓰레드가 종료되지 않도록 하기위함
	
		try {
			th.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");
	}
}

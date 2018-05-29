package com.javaex.thread.ex02;

public class AlphabetThread extends Thread {

	@Override
	public void run() {
		for(char ch= 'A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

}

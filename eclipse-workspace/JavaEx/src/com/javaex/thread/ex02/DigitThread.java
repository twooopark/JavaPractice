package com.javaex.thread.ex02;

public class DigitThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		super.run();
	}

}



package com.javaex.thread.ex03;



// Runnable 인터페이스를 사용
public class MainThread {
	public static void main (String args[]) {
	

		Thread th = new Thread(new DigitThread());
		Thread th2 = new Thread(new AlphabetThread());
		
		//우선순위 지정 (최우선:10 ... 1) (컴퓨터 사양이 좋아져 서로 경쟁상대가 됮 않음: 결과 똑같음)
		//상수나  enum을 이용하여 가독성을 높여라
		th.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MIN_PRIORITY);
		
		
		th.start();
		th2.start();
		
		
		try {
			th.join();
			th2.join();
		
		}catch(InterruptedException e) {
			
		}
		System.out.println("메인쓰레드 종료");
	}
}

package com.javaex.exam.fin.java.q02;

public class Question02 {
	public int getAnswer(int toNum) {
		//	TODO: 이곳에 해답을 작성합니다.
		int n = toNum;//최소의 정수
		int cnt = 0;
		while(true) {
			n++; 
			for(int i=1; i<=toNum; i++) {
				if(n%i==0) {//n은 i로 나누어 떨어지는가?
					cnt++;
					if(cnt==toNum){
						return n;
					}
				}
				else {
					cnt=0;
				}
			}
		}

	}
}
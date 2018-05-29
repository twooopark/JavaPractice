package com.javaex.api.objectclass.ex03;

import java.util.Arrays;

public class Scoreboard implements Cloneable{
	private int[] scores;
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public Scoreboard getClone() {
		Scoreboard clone = null;//복제를 위한 객체 선언
				
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	@Override
	public String toString() {
		String output = "Scoreboard(";
		
		for(int i = 0;i<scores.length; i++) {
			output+= scores[i];
			if(i<scores.length-1){
				output+=",";
			}
		}
		return output+")";
	}
	@Override //깊은 복제를 위하여 재정의하도록 한다.
	//clone 메소드를 오버라이드 할 경우, 서브 클래스의 clone에서는 반드시 super.clone을 호출하고 반환해야 한다
	public Object clone() throws CloneNotSupportedException {
		//얕은 복제
		Scoreboard clone = (Scoreboard)super.clone();
		//깊은 복제
		clone.scores = Arrays.copyOf(scores, scores.length);

		//return super.clone(); //기존 클론
		return clone; //새로만든 클론
	}
}

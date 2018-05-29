package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum{
	int num;
	public SimpleNum(int num) {
		this.num = num;
		
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof SimpleNum) {
			SimpleNum other = (SimpleNum)obj;
			return num == other.num;
		}
			return super.equals(obj);
	}
	@Override
	public int hashCode() {
//		return super.hashCode();
		return num;
	}
}

public class HashSetEx {
	public static void main(String args[]) {
		HashSet<SimpleNum> hs = new HashSet<SimpleNum>();

		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		//해시는 값이 중복되지 않는다, 하지만 s2, s3은 서로 다른 객체로 판단한다. 그러므로 가능함.
		//이를 해결하기 위해 equals과 hashCode를 오버라이딩 했다.
		//기본의(object의) hashCode메서드는 객체의 메모리번지를 이용해 해시코드 생성함
		//--> 단순히 num을 리턴하게 바꾸면서 s2와 s3을 같은 값으로 인식하게 

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		System.out.println(hs);
		
	}

}

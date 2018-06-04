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
//	@Override
//	public boolean equals(Object obj){
//		if(obj instanceof SimpleNum) { //확인하는 이유는?
//			SimpleNum other = (SimpleNum)obj;
//			return num == other.num;
//		}
//			return super.equals(obj);
//	}
//	@Override
//	public int hashCode() {
////		return super.hashCode();
//		return num;
//	}
}

public class HashSetEx {
	public static void main(String args[]) {
		HashSet<SimpleNum> hs = new HashSet<SimpleNum>();

		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		// Hash관련 컬렉션들은 다음 순서와 같이 같은지 판단한다.
		//1.hashCode()를 이용해 객체 식별 코드 일치 여부 확인(객체의 메모리 번지를 이용해 해시코드 생성)=> 각 객체는 다른 값을 가진다.
		//2.equals()값을 이용해 한번 더 일치여부 확인 후, 같으면 동등 객체로 판단한다.
		
		//++ 여기서 의문점, hashCode()와 equals()의 차이점은??
		//hashCode() 4byte의 범위 내에서 생성된 코드이다. 그러므로 다른 객체인데 매우 작은확률로 같을 수 있다.

		System.out.println(s2.getClass().getName());
		System.out.println(s2.hashCode());
		System.out.println("위는 s2, 아래는 s3");
		System.out.println(s3.getClass().getName());
		System.out.println(s3.hashCode());
		
		System.out.println("s2.equals(s3): "+s2.equals(s3));
		//객체가 동일한지 판단한다. 그러므로 s2, s3을 서로 다른 객체로 판단한다.
		
		//이를 해결하기 위해 equals과 hashCode를 오버라이딩 했다. (객체가 아닌, 값이 동일한 상황이 없게 해보자)
		//기본의(object의) hashCode메서드는 객체의 메모리번지를 이용해 해시코드 생성함
		//--> 단순히 num을 리턴하게 바꾸면서 s2와 s3을 같은 값으로 인식하게 

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		System.out.println(hs);
		
	}

}

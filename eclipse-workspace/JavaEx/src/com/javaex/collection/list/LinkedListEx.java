package com.javaex.collection.list;

import java.util.*;

public class LinkedListEx {
	public static void main(String args[]) {
		List<String> l = new LinkedList<String>();

	
		//객체 삽입
		l.add("java");
		l.add("c");
		l.add("c++");
		l.add("python");

		//중간 삽입
		l.add(2,"c#");
		System.out.println(l);

		System.out.println("Size: " + l.size());
//		LinkedList는 동적으로 생성되기 때문에 V처럼 capacity가 없다.
//		System.out.println(", Capacity: " +l.capacity()); //error
		
	
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}

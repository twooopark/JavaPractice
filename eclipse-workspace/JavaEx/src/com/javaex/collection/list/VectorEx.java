package com.javaex.collection.list;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		//벡터의 선언
		Vector<Integer> v = new Vector<>();
		System.out.println("Size: " + v.size()
						+ ", Capacity: " +v.capacity());
		for(int i=1; i<=10; i++) {
			v.addElement(i);
		}
		v.addElement(100);
		System.out.println("Size: " + v.size()
		+ ", Capacity: " +v.capacity());
		v.insertElementAt(123, 8);
		System.out.println(v);
		
		int val = v.elementAt(5);
		System.out.println(val);
		System.out.println("index of 7:" + v.indexOf(7));
		System.out.println("index of 0:" + v.indexOf(0));
		System.out.println("contains 10:" + v.contains(11));
		
		
		// Iter , Enumer 둘다 가능
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			Integer item = it.next();
			System.out.println(item);
		}
		
//		Enumeration<Integer> e = v.elements();
//		
//		while(e.hasMoreElements()) {
//			Integer item = e.nextElement();
//			System.out.println(item);
//		}
		
		
		v.clear();
		System.out.println("v.clear!! \nv="+v);
		System.out.println("Size: " + v.size()
		+ ", Capacity: " +v.capacity());
		
		
		//다양한 형식을 받아보자
		Vector<? super Number> v2 = new Vector<>();
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement(Character.valueOf('a'));
//		v2.addElement("java");
		//these are not contained Number
		
		System.out.println(v2);

	}
}

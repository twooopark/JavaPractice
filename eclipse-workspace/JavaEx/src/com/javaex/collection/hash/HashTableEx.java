package com.javaex.collection.hash;
import java.util.*;

class ClassRoom{
	String subject;
	String roomName;
	
	public ClassRoom(String subject, String roomName) {
		super();
		this.subject = subject;
		this.roomName = roomName;
	}
	public ClassRoom(String roomName) {
		super();
		this.roomName = roomName;
	}
	
	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}

	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject);
		}
			return super.equals(obj);
	}
	
}

public class HashTableEx {
	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<>();
		
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("401", new ClassRoom("Linux", "R401"));
		System.out.println(map);
		
		//값 변경
		map.put("201", new ClassRoom("C#", "R201"));
		System.out.println(map);
		System.out.println(map.get("201"));

		System.out.println(map.containsKey("301"));//true
		System.out.println(map.containsKey("501"));//false

		System.out.println(map.containsValue("Java"));//false
		System.out.println(map.containsValue(new ClassRoom("Java")));//true
		
		//iter 하려면 Keyset을 받아서 iter 한번 더 돌려야 합니다.
		System.out.println("itertator=========");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom r = map.get(it.next());
			System.out.println(r);
		}//subject를 기준으로 순서대로 출력된다.
		
		
		map.clear();
	}
}

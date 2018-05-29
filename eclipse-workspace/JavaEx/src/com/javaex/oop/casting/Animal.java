package com.javaex.oop.casting;

public class Animal {
	protected String name; //Protected하는 이유는??
	
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(name + " is eating");
		
	}
	public void walk() {
		System.out.println(name + " is walking");
		
	}
}

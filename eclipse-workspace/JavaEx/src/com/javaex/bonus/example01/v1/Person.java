package com.javaex.bonus.example01.v1;

public abstract class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void speak();
}

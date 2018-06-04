package com.javaex.bonus.example01.v4;

public abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//	v4에 추가
	public abstract void speak();
	public abstract void kungfu();
}

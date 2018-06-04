package com.javaex.bonus.example01.v1;

public class MatrixPerson extends Person {

	public MatrixPerson(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.printf("My name is %s in Matrix%n", name);
	}
}

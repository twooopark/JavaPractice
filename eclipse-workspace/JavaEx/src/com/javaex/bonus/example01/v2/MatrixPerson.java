package com.javaex.bonus.example01.v2;

public class MatrixPerson extends Person {

	public MatrixPerson(String name) {
		super(name);
	}

	@Override
	public void speak() {
//		System.out.printf("My name is %s in Matrix%n", name);
		speak(String.format("My name is %s in Matrix%n", name));
	}

	public void speak(String message) {
		System.out.println(message);
	}
	
	@Override
	public void kungfu() {
		speak("Ok, I know KungFu!");
	}
}

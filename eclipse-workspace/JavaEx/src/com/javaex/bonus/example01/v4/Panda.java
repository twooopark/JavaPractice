package com.javaex.bonus.example01.v4;

public class Panda extends Animal {

	public Panda(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("말할 수 있어요");
	}

	@Override
	public void kungfu() {
		System.out.println("아뵤~!");
	}
	

}

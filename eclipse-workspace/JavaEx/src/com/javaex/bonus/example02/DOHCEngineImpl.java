package com.javaex.bonus.example02;

public class DOHCEngineImpl implements Engine {

	@Override
	public void turnOn() {
		System.out.println("DOHC Engine is ON");
	}

	@Override
	public void run() {
		System.out.println("Engine is Running...");
		
	}

	@Override
	public void stop() {
		System.out.println("Engine is Stopped!");
		
	}

	@Override
	public void turnOff() {
		System.out.println("DOHC Engine is ON");
	}

}

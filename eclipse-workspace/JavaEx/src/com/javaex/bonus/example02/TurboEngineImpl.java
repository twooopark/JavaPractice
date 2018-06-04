package com.javaex.bonus.example02;

public class TurboEngineImpl implements Engine {

	@Override
	public void turnOn() {
		System.out.println("Turbo Engine is On!");
		
	}

	@Override
	public void run() {
		System.out.println("Turbo Engine is Running!");
	}

	@Override
	public void stop() {
		System.out.println("Turbo Engine is Stopped!");
	}

	@Override
	public void turnOff() {
		System.out.println("Turbo Engine is Off!");
	}
}

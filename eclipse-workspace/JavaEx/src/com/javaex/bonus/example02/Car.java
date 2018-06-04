package com.javaex.bonus.example02;

public class Car {
	protected String name;
	protected String color;
	protected Engine engine;
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Car(String name, String color, Engine engine) {
		this(name, color);
		this.engine = engine;
	}

	public void drive() {
		engine.turnOn();
		engine.run();
		engine.stop();
		engine.turnOff();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}

package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {

		//nomal
		Dog d2 = new Dog("Doogy");
		d2.eat();
		d2.walk();
		d2.bark();
		
		//upcasting
		Animal d1 = new Dog("Snoopy");
		d1.eat();
		d1.walk();
//		d1.bark(); //불가능

		//downcasting
		//bark() 가능
		Dog d3 = (Dog)d1;
		d3.bark();
		//또는
		((Dog)d1).bark();
		

		// 업캐스팅이 사용되는 예시이다.
		Animal pet = new Dog("Ari");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		}else if(pet instanceof Cat) {
			((Cat)pet).meow();
		}
		
		
	}

}

package com.javaex.bonus.example02;

public class StageApp {

	public static void main(String[] args) {
		Car car = new Car("라이트닝 맥퀸", "RED");
		Engine e = new DOHCEngineImpl();
		car.setEngine(e);
		
		car.drive();

		//	엔진을 교체해 봅시다.
		car.setEngine(new TurboEngineImpl());
		car.drive();
		
		//	다시 엔진을 교체해 봅시다: 즉석 구현 익명 엔진 
		car.setEngine(new Engine() {
			@Override
			public void turnOn() {
				System.out.println("익명 엔진을 켰습니다.");
			}

			@Override
			public void run() {
				System.out.println("익명 엔진을 구동합니다.");
			}

			@Override
			public void stop() {
				System.out.println("익명 엔진을 정지합니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 엔진을 껐습니다.");
			}
		});
	}
}

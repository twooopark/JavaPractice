package com.javaex.bonus.example01.v3;

public class StageApp {

	public static void main(String[] args) {
		MatrixPerson p = new MatrixPerson("NEO");
		p.speak();
		
		//	이제 MatrixPerson NEO는 쿵후를 할 수 있게 되었습니다.
		p.kungfu();
		
		//	이제 MatrixPerson NEO는 운전을 할 수 있게 되었습니다.
		p.drive();
		
		//	판다를 등장시켜 보기로 하죠
		Panda panda = new Panda("포");
		
		//	판다에게 말을 시켜 보도록 합시다.
//		panda.speak();	//	말을 할 수 없습니다.
		//	판다에게 쿵후도 시켜 봅시다.
//		panda.kungfu();	//	쿵후를 할 수 없습니다.
		
		//	Animal에 말하고 쿵후하는 메서드를 넣어야 할까요?
		//	->	V4
	}

}

package com.javaex.bonus.example01.v5;

public class StageApp {
	
	public static void main(String[] args) {
		MatrixPerson p = new MatrixPerson("NEO");
		p.speak();
		p.kungfu();	//	이제 MatrixPerson NEO는 쿵후를 할 수 있게 되었습니다.
		p.drive();	//	이제 MatrixPerson NEO는 운전을 할 수 있게 되었습니다.
		
		Panda panda = new Panda("포");
		
		//	판다에게 말과 쿵후를 시켜 보도록 합시다.
		panda.speak();	//	이제는 말을 할 수 없습니다.
		panda.kungfu();	//	이제는 쿵후를 할 수 없습니다.
		//	하지만 뭔가 자연스럽지 않습니다
	}
}

package com.kay.facade;

import com.kay.facade.system.Facade;

public class Application {

	public static void main(String[] args) {
		Facade facade = new Facade();
		// 한번 호출로 서브 시스템에 복잡한 과정을 신경 안쓰고 process 됨
		// 또 HelpSystem은 default라 패키지에서만 접근 가능
		facade.process();
	}

}

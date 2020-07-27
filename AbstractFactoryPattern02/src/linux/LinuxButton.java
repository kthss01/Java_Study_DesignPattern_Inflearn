package linux;

import abst.Button;

// 지워야함 다른 곳에서 호출 될 수 없게

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("Linux Button");
	}

}

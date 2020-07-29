package com.kay.facade.system;

// public 뺄 수 있음 package에서만 접근 할 수 있음
class HelpSystem3 {

	public HelpSystem3() {
		System.out.println("Call Constructor : " + getClass().getName());
	}
	
	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
	}
}

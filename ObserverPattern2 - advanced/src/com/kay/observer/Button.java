package com.kay.observer;

import java.util.Observable;

// Button은 view를 상속 받고 시작하는 경우임 그래서 이중 상속이 안됨
public class Button extends Observable {

	public void onClick() {
		setChanged();
		notifyObservers();
	}
}

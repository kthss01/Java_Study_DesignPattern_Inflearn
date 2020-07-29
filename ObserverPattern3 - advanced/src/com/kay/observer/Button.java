package com.kay.observer;

import com.kay.observer.Observable.Observer;

public class Button {

	private Observable<String> observable;
	
	public Button() {
		observable = new Observable<String>();
	}

	public  void addObserver(Observer<String> o) {
		observable.addObserver(o);
	}
	
	public void notifyObservers() {
		observable.notifyObservers(null);
	}
	
	public void onClick() {
		observable.setChanged();
		notifyObservers();
	}
}

package com.kay.observer;

// 둘다 사라질 클래스
import java.util.Observable;
import java.util.Observer;

public class Application {

	public static void main(String[] args) {
//		Observable observable; // 그냥 클래스임
//		Observer observer;
		
		Button button = new Button();
		button.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println(o + " is Clicked");
			}
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
	}
}

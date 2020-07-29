package com.kay.observer;

import com.kay.observer.Button.OnClickListener;

public class Application {

	public static void main(String[] args) {
		
		Button button = new Button();
	
		// 익명 클래스로 더 많이 쓰임
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(Button button) {
				System.out.println(button + " is Clicked");
			}
		});
		
		button.onClick();
		
	}

}

//class ButtonClick implements OnClickListener {
//
//	@Override
//	public void onClick(Button button) {
//		System.out.println(button + "is Clicked");
//	}
//	
//}
package com.kay.memento;

import java.util.Stack;

import com.kay.memento.abc.Memento;
import com.kay.memento.abc.Originator;

public class Application {

	public static void main(String[] args) {
		
		// CareTaker는 stack으로 사용해봄
		Stack<Memento> mementos = new Stack<>();
		
		Originator originator = new Originator();
		
		originator.setState("state 1");
		mementos.push(originator.createMemento());

		// 실수나 악의적으로 넣어버리면 상태값이 변해버림
		// 외부에서 메멘토를 바꾸는 기능을 주면 안됨 -> protected로 해야함 상속받은 객체나 패키지 내에서만 사용가능
		// pubilc이면 아래와 같이 해버림
//		Memento memento = originator.createMemento();
//		memento = new Memento("state something");
//		Strng state = memento.getState();
//		state += "23"; // 이런식으로 가져와서 상태값을 가져가거나 할 수 있음 setState가 있다면 변경도 가능하고
//		mementos.push(memento);
		
		originator.setState("state 2");
		mementos.push(originator.createMemento());
		
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		
		originator.setState("state Final");
		mementos.push(originator.createMemento());
		
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state final
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 3
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 2
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 1
		
	}
}

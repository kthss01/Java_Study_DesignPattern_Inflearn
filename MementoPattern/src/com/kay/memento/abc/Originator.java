package com.kay.memento.abc;

public class Originator {
	
	String state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}

package com.umiitkose.behavioral.state.person;

public class HappyState implements EmotionalState {

	public String sayGoodbye() {
		return "Bye, friend!";
	}

	public String sayHello() {
		return "Hello, friend!";
	}

}
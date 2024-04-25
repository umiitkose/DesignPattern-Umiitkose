package com.umiitkose.behavioral.strategy.designpattern;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}

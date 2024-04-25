package com.umiitkose.behavioral.strategy.designpattern;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}

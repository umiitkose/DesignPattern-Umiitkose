package com.umiitkose.behavioral.strategy.designpattern;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}

package com.umiitkose.structural.decorator.designpattern.pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}

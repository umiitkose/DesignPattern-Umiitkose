package com.umiitkose.structural.decorator.coffee.decorator;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}

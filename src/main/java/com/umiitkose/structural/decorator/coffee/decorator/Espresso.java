package com.umiitkose.structural.decorator.coffee.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return .20;
    }
}

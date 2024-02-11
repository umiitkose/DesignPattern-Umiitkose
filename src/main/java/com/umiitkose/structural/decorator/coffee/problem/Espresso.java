package com.umiitkose.structural.decorator.coffee.problem;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 2;
    }
}

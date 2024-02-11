package com.umiitkose.structural.decorator.coffee.problem2;


public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 2 + super.cost();
    }
}

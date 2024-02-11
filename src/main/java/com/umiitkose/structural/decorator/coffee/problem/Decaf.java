package com.umiitkose.structural.decorator.coffee.problem;

public class Decaf extends Beverage {
    public Decaf() {
        description="Decaf Coffee";
    }

    @Override
    double cost() {
        return 3;
    }
}

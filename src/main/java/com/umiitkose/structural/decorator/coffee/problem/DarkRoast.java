package com.umiitkose.structural.decorator.coffee.problem;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description="Dark Roast Coffee";
    }

    @Override
    double cost() {
        return 5;
    }
}

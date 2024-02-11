package com.umiitkose.structural.decorator.coffee.problem2;


public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    double cost() {
        return 5 + super.cost();
    }


}

package com.umiitkose.structural.decorator.coffee.problem;

public class DarkRoastWithMilk extends Beverage{

    public DarkRoastWithMilk() {
        description="DarkRoast with milk";
    }

    @Override
    double cost() {
        return 6;
    }
}

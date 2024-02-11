package com.umiitkose.structural.decorator.coffee.problem;

public class DecafWithMilk extends Beverage{

    public DecafWithMilk() {
        description="Decaf with milk";
    }

    @Override
    double cost() {
        return 4;
    }
}

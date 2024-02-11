package com.umiitkose.structural.decorator.coffee.problem;

public class DecafWithMocha extends Beverage{

    public void EsprossoWithMilk() {
        description="Decaf with mocha";
    }

    @Override
    double cost() {
        return 3;
    }
}

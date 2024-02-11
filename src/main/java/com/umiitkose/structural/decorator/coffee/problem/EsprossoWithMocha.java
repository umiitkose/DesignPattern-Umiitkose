package com.umiitkose.structural.decorator.coffee.problem;

public class EsprossoWithMocha extends Beverage{

    public void EsprossoWithMilk() {
        description="Espresso with mocha";
    }

    @Override
    double cost() {
        return 3;
    }
}

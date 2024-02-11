package com.umiitkose.structural.decorator.coffee.problem;

public class EsprossoWithMilk extends Beverage{

    public EsprossoWithMilk() {
        description="Espresso with milk";
    }

    @Override
    double cost() {
        return 4;
    }
}

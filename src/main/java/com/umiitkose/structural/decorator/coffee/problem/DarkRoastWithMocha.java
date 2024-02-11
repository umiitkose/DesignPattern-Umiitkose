package com.umiitkose.structural.decorator.coffee.problem;

public class DarkRoastWithMocha extends Beverage{

    public void EsprossoWithMilk() {
        description="DarkRoast with mocha";
    }

    @Override
    double cost() {
        return 3;
    }
}

package com.umiitkose.structural.decorator.coffee.problem;

public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    abstract double cost();
}

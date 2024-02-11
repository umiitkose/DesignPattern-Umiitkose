package com.umiitkose.structural.decorator.coffee.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return .60;
    }
}

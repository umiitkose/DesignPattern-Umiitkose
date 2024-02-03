package com.umiitkose.behavioral.strategy.duck.problem1;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void fly() {
    }
}

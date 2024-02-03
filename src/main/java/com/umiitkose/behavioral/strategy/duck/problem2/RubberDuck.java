package com.umiitkose.behavioral.strategy.duck.problem2;

public class RubberDuck extends Duck implements Quack {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    void display() {
        System.out.println("RubberDuck");
    }

}

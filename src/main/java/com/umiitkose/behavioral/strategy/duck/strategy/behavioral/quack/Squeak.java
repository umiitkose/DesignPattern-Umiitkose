package com.umiitkose.behavioral.strategy.duck.strategy.behavioral.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

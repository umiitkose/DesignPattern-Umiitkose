package com.umiitkose.behavioral.strategy.duck.problem1;

public class DecoyDuck extends Duck {
    @Override
    void display() {
        System.out.println("Decoy Duck");
    }

    @Override
    public void quack() {
    }

    @Override
    public void fly() {
    }
}

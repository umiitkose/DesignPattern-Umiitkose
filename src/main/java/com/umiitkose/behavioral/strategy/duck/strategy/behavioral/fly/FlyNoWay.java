package com.umiitkose.behavioral.strategy.duck.strategy.behavioral.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("No fly");
    }
}

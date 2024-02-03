package com.umiitkose.behavioral.strategy.duck.strategy.behavioral.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}

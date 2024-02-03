package com.umiitkose.behavioral.strategy.duck.strategy.behavioral.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("muteQuack");
    }
}

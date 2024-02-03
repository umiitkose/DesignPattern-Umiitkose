package com.umiitkose.behavioral.strategy.duck.strategy;

import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.fly.FlyBehavior;
import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.quack.QuackBehavior;

public abstract class Duck {

    public void swim() {
        System.out.print("Swim");
    }

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public abstract void display();

}

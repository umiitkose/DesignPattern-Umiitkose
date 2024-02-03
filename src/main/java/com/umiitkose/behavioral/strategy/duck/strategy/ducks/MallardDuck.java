package com.umiitkose.behavioral.strategy.duck.strategy.ducks;

import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.fly.FlyBehavior;
import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.quack.QuackBehavior;
import com.umiitkose.behavioral.strategy.duck.strategy.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Hi, Mallard Duck !");
    }

}

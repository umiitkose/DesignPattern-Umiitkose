package com.umiitkose.behavioral.strategy.duck.strategy.ducks;

import com.umiitkose.behavioral.strategy.duck.strategy.Duck;
import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.fly.FlyBehavior;
import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.quack.QuackBehavior;

public class RedheadDuck extends Duck {

    public RedheadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Hi, RedHead Duck !! ");
    }

}

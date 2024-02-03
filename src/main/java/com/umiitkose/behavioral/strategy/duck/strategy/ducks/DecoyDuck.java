package com.umiitkose.behavioral.strategy.duck.strategy.ducks;

import com.umiitkose.behavioral.strategy.duck.strategy.Duck;
import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.fly.FlyBehavior;
import com.umiitkose.behavioral.strategy.duck.strategy.behavioral.quack.QuackBehavior;

public class DecoyDuck extends Duck {

    public DecoyDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }


}

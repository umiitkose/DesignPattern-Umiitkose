package com.umiitkose.behavioral.strategy.duck.strategy.behavioral.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("Quack");
    }
}

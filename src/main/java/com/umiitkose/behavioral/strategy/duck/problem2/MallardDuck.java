package com.umiitkose.behavioral.strategy.duck.problem2;

public class MallardDuck extends Duck implements Fly,Quack{
    @Override
    void display() {
        System.out.println("Hi, Mallard Duck !");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}

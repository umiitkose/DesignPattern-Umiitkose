package com.umiitkose.behavioral.strategy.duck.problem1;

public abstract class Duck {

    //Bütün ördekler quack ve swim özelliğine sahip.
    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.print("Swim");
    }

    public void fly() {
        System.out.println("Fly");
    }

    abstract void display();

}

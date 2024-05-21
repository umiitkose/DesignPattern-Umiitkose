package com.umiitkose.behavioral.memento.game;



public class Main {
    public static void main(String[] args) {
        Origination originator = new Origination();

        Caretaker careTaker = new Caretaker();

        originator.setState("State #1");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(2));
        System.out.println("Third saved State: " + originator.getState());


    }
}

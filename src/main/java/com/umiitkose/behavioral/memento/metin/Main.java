package com.umiitkose.behavioral.memento.metin;



public class Main {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker caretaker=new CareTaker();
        originator.setState("state1");
        caretaker.save(originator.saveMemento());
        originator.setState("state2");
        caretaker.save(originator.saveMemento());
        originator.setState("state3");
        caretaker.save(originator.saveMemento());
        originator.setState("state4");
        originator.setState("state5");
        originator.setState("state6");
        caretaker.save(originator.saveMemento());
        originator.setState("state7");
        originator.setState("state8");

        System.out.println(caretaker.getState(0));
        System.out.println(caretaker.getState(1));
        System.out.println(caretaker.getState(2));
        System.out.println(caretaker.getState(3));
        System.out.println(originator.getState());




    }
}

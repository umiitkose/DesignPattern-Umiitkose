package com.umiitkose.behavioral.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementos;

    public Caretaker() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return this.mementos.get(index);
    }
}

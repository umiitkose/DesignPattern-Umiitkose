package com.umiitkose.behavioral.memento.metin;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList;

    public CareTaker() {
        mementoList=new ArrayList<>();
    }

    public String getState(int index){
        return mementoList.get(index).getState();
    }

    public void save(Memento memento){
        mementoList.add(memento);
    }
}

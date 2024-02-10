package com.umiitkose.behavioral.observer.abone;

public interface Observable {

    void addUser(Observer user);
    void removeUser(Observer user);
    void notifyUsers();
}

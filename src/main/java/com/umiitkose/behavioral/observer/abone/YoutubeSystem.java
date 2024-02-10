package com.umiitkose.behavioral.observer.abone;

import java.util.ArrayList;
import java.util.List;

public class YoutubeSystem implements Observable {

    List<Observer> userList = new ArrayList<>();

    @Override
    public void addUser(Observer user) {
        userList.add(user);
    }

    @Override
    public void removeUser(Observer user) {
        userList.remove(user);
    }

    @Override
    public void notifyUsers() {
        for (Observer user : userList) {
            user.getNotify("Kanalımıza abone olduğunuz için teşekkür ederiz.");
        }
    }
}

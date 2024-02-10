package com.umiitkose.behavioral.observer.abone;

public class User implements Observer {

    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void getNotify(String message) {
        System.out.println(username + " kullanıcısına mesaj geldi. Alınan mesasge : " + message);
    }
}

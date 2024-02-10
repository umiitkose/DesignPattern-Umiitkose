package com.umiitkose.behavioral.observer.bildirim;

public interface MessageSystem {

    void addUser(Abone kullanici);

    void removeUser(Abone kullanici);

    void sendMessage(String mesaj);
}

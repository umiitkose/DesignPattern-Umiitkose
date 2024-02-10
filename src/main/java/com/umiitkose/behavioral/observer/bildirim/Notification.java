package com.umiitkose.behavioral.observer.bildirim;

import java.util.ArrayList;
import java.util.List;

public class Notification implements MessageSystem {

    private List<Abone> kullaniciList;

    public Notification() {
        kullaniciList = new ArrayList<>();
    }

    @Override
    public void addUser(Abone kullanici) {
        kullaniciList.add(kullanici);
    }

    @Override
    public void removeUser(Abone kullanici) {
        kullaniciList.remove(kullanici);
    }

    @Override
    public void sendMessage(String mesaj) {
        kullaniciList.forEach(
                kullanici -> kullanici.mesajAl(mesaj)
        );

    }
}

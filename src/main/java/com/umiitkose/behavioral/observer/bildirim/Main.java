package com.umiitkose.behavioral.observer.bildirim;

public class Main {
    public static void main(String[] args) {
        Abone mehmet = new Kullanici("Mehmet");
        Abone umit = new Kullanici("Ümit");

        MessageSystem notification = new Notification();

        notification.addUser(mehmet);

        notification.sendMessage("Merhaba Dünya ");

        notification.addUser(umit);

        notification.sendMessage("Yeni dergi yayında..");

        notification.removeUser(mehmet);

        notification.sendMessage("Yeni bir mesaj");
    }
}

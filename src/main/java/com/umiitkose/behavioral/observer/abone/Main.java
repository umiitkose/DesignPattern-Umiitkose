package com.umiitkose.behavioral.observer.abone;

public class Main {
    public static void main(String[] args) {
        Observer umit = new User("umiitkose");
        Observer ahmet = new User("ahmet");
        Observer sinem = new User("sinem");

        Observable youtube = new YoutubeSystem();

        youtube.addUser(umit);
        youtube.addUser(ahmet);

        youtube.notifyUsers();
        System.out.println("-------");
        youtube.addUser(sinem);

        youtube.notifyUsers();
        System.out.println("-------");
        youtube.removeUser(ahmet);

        youtube.notifyUsers();
        System.out.println("-------");
    }
}

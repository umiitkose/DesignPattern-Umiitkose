package com.umiitkose.creational.singleton.example;

public class Main extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Main().start();
        }
    }

    public void run() {
        CacheClient cacheClient = CacheClient.getInstance();
        CacheClient.print();
    }
}

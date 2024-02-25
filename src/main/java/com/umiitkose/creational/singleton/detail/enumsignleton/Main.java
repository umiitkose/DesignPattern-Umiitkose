package com.umiitkose.creational.singleton.detail.enumsignleton;

public class Main extends Thread {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new Main().start();
        }
    }

    @Override
    public void run() {
        EnumSingleton instance1 = EnumSingleton.SINGLETON;
        EnumSingleton instance2 = EnumSingleton.SINGLETON;


        if (instance1 == instance2)
            System.out.println("The same");
        else
            System.out.println("Different");


    }
}

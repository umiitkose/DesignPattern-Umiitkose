package com.umiitkose.creational.singleton.detail.doublechecklockingsignleton;

public class Main extends Thread {

    public static void main(String[] args) {

        for (int i = 0; i < 20000; i++) {
            new Main().start();
        }
    }

    @Override
    public void run() {
        SignletonExample signletonExample = SignletonExample.createSingleObject();
        signletonExample.print();
    }
}

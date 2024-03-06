package com.umiitkose.creational.singleton.detail.eagersignleton;

public class SignletonExample {

    /*
     * Signleton için maddeler :
     * constructor private olmalı.
     *
     * */

    private static SignletonExample signletonObject = new SignletonExample();
    private int count = 0;
    String print = "";

    private SignletonExample() {
        print = "Signleton Created " + count;
        count++;
    }

    public static SignletonExample getSignletonObject() {

        return signletonObject;
    }

    public void print(String threadName) {
        System.out.println(threadName + " | " + print);
    }
}

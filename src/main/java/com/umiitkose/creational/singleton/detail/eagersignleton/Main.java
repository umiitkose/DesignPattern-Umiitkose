package com.umiitkose.creational.singleton.detail.eagersignleton;

public class Main extends Thread{

    public static void main(String[] args) {
        SignletonExample s1=SignletonExample.getSignletonObject();
        for (int i = 0; i < 10; i++) {
            new Main().start();
            new Main().start();
            new Main().start();
            new Main().start();
        }

        //SignletonExample s1=SignletonExample.getSignletonObject();
        SignletonExample s2=SignletonExample.getSignletonObject();

        if(s1.hashCode() == s2.hashCode()){
            System.out.println("same");
        }
    }

    @Override
    public void run() {
        SignletonExample signletonExample = SignletonExample.getSignletonObject();
        signletonExample.print(Thread.currentThread().getName());
    }
}

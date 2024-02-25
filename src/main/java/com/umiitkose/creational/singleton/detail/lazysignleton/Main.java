package com.umiitkose.creational.singleton.detail.lazysignleton;

public class Main extends Thread {

    public static void main(String[] args) {
        //Threadli yapı olmasaydı sorun yoktu fakat gerçek dünya böyle değil..
      /*  for (int i = 0; i < 100; i++) {
            SignletonExample signletonExample = SignletonExample.createSingleObject();
            signletonExample.print();
        }*/

        /* lazy singleton iyi hoş ama threadli bir yapıda sorun çıkarır..
         * */

        for (int i = 0; i < 200; i++) {
            new Main().start();
        }
    }

    @Override
    public void run() {
        SignletonExample signletonExample = SignletonExample.createSingleObject();
        signletonExample.print();
    }
}

package com.umiitkose.behavioral.state.oyunkonsolu;

public class Main {
    public static void main(String[] args) {

/** Bu design pattern'e uymuyor, bunu başka sizde state pattern'e dönüştürmeyi deneyebilirsiniz..*/
        Oyun oyun = new Oyun();

        oyun.x();
        oyun.ucgen();
        oyun.yuvarlak();

        oyun.topuKaptir();

        oyun.ucgen();
        oyun.yuvarlak();

        oyun.topuKap();

        oyun.kare();
        oyun.x();

    }
}

package com.umiitkose.structural.decorator.firin;

public class Ekmek extends Hamur {

    public Ekmek() {
        isim = "Ekmek";
    }

    @Override
    double maliyet() {
        return 8;
    }
}

package com.umiitkose.creational.abstractfactory.banka;

public class Akbank extends Banka {
    @Override
    String bankaAdi() {
        return "Akbank";
    }

    @Override
    double bankaKrediOrani() {
        return 1.2;
    }
}

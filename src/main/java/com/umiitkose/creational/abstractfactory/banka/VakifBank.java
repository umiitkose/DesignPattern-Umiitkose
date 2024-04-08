package com.umiitkose.creational.abstractfactory.banka;

public class VakifBank extends Banka {
    @Override
    String bankaAdi() {
        return "Vakıfbank";
    }

    @Override
    double bankaKrediOrani() {
        return 2.7;
    }
}

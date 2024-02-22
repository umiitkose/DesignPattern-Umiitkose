package com.umiitkose.creational.factory.banka;

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

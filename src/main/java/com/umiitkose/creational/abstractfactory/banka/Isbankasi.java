package com.umiitkose.creational.abstractfactory.banka;

public class Isbankasi extends Banka {
    @Override
    String bankaAdi() {
        return "İş Bankası";
    }

    @Override
    double bankaKrediOrani() {
        return 2.5;
    }
}

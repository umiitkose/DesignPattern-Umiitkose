package com.umiitkose.creational.abstractfactory.banka;

public class ZiraatBankasi extends Banka {
    @Override
    String bankaAdi() {
        return "Ziraat Bankası";
    }

    @Override
    double bankaKrediOrani() {
        return 2.1;
    }
}

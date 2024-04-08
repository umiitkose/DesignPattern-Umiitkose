package com.umiitkose.creational.abstractfactory.banka;

public class AkbankFactory implements BankaFactory {
    @Override
    public Banka bankaOlustur() {
        return new Akbank();
    }
}

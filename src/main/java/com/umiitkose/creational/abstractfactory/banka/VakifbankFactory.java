package com.umiitkose.creational.abstractfactory.banka;

public class VakifbankFactory implements BankaFactory {
    @Override
    public Banka bankaOlustur() {
        return new VakifBank();
    }
}

package com.umiitkose.creational.factory.banka;

public class BankaFactory {

    public Banka bankaOlustur(String type) {
        switch (type) {
            case "akbank":
                return new Akbank();
            case "isbankasi":
                return new Isbankasi();
            case "vakif":
                return new VakifBank();
            default:
                return new ZiraatBankasi();
        }
    }
}

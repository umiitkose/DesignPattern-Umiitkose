package com.umiitkose.creational.abstractfactory.banka;

public class Main {
    public static void main(String[] args) {

        BankaFactory akbankFactory=new AkbankFactory();
        Banka akbank = akbankFactory.bankaOlustur();
        System.out.println(akbank.bankaAdi() + " -> " + akbank.bankaKrediOrani());

        BankaFactory vakifbankFactory=new VakifbankFactory();
        Banka vakifbank = vakifbankFactory.bankaOlustur();
        System.out.println(vakifbank.bankaAdi() + " -> " + vakifbank.bankaKrediOrani());

    }
}

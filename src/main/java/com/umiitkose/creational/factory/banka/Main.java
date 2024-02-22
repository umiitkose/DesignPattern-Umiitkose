package com.umiitkose.creational.factory.banka;

public class Main {
    public static void main(String[] args) {

        BankaFactory bankaFactory=new BankaFactory();
        Banka banka = bankaFactory.bankaOlustur("akbank");
        banka.krediHesapla();

    }
}

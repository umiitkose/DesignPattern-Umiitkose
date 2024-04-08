package com.umiitkose.creational.abstractfactory.banka;

public abstract class Banka {

    abstract String bankaAdi();
    abstract double bankaKrediOrani();

    public void krediHesapla() {
        System.out.println(bankaAdi() + " bankasının kredi oranı " + bankaKrediOrani());

    }

}

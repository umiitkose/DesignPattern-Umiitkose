package com.umiitkose.behavioral.state.oyunkonsolu;

public class Defans implements Konsol {
    public Defans() {
        System.out.println("Defans Yapılıyor..");
    }

    @Override
    public void kareBas() {
        System.out.println("Müdehale Ediliyor.");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Kaleci Açılıyor.");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Kayarak Müdahale Yapılıyor.");
    }

    @Override
    public void xBas() {
        System.out.println("Markaj Yapılıyor.");
    }
}

package com.umiitkose.behavioral.mediator.elektronik;

public class Radyo extends ElektronikAygit {

    public Radyo(final Arabulucu arabulucu) {
        super(arabulucu);
        arabulucu.radyoEkle(this);
    }

    @Override
    public void calistir() {
        System.out.println("Radyo çalıştı.");
        arabulucu.radyoCalistir();
    }

    @Override
    public void durdur() {
        System.out.println("Radyo durdu.");
    }
}
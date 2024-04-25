package com.umiitkose.behavioral.mediator.elektronik;

public class Televizyon extends ElektronikAygit {

    public Televizyon(final Arabulucu arabulucu) {
        super(arabulucu);
        arabulucu.televizyonEkle(this);
    }

    @Override
    public void calistir() {
        System.out.println("Televizyon çalıştı.");
        arabulucu.televizyonCalistir();
    }

    @Override
    public void durdur() {
        System.out.println("Televizyon durdu.");
    }
}

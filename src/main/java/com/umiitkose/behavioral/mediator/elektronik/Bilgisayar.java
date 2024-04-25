package com.umiitkose.behavioral.mediator.elektronik;

public class Bilgisayar extends ElektronikAygit {

    public Bilgisayar(final Arabulucu arabulucu) {
        super(arabulucu);
        arabulucu.bilgisayarEkle(this);
    }

    @Override
    public void calistir() {
        System.out.println("Bilgisayar çalıştı.");
        arabulucu.bilgisayarCalistir();
    }

    @Override
    public void durdur() {
        System.out.println("Bilgisayar durdu.");
    }
}

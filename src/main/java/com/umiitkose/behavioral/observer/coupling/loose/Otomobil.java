package com.umiitkose.behavioral.observer.coupling.loose;

public class Otomobil implements Arac {
    @Override
    public void calistir() {
        System.out.println("Araç Çalıştı ");
    }

    @Override
    public void ilerle() {
        System.out.println("Araç ilerledir. ");
    }

    @Override
    public void durdur() {
        System.out.println("Araç Durdu. ");
    }
}

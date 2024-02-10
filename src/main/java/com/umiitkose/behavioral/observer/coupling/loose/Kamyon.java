package com.umiitkose.behavioral.observer.coupling.loose;

public class Kamyon implements Arac{
    @Override
    public void calistir() {
        System.out.println("Kamyon Çalıştı.");
    }

    @Override
    public void ilerle() {
        System.out.println("Kamyon gidiyor.");
    }

    @Override
    public void durdur() {
        System.out.println("Kamyon durdu.");
    }
}

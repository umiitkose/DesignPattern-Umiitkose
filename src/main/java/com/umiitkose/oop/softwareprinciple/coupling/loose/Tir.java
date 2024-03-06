package com.umiitkose.oop.softwareprinciple.coupling.loose;

public class Tir implements Arac {
    @Override
    public void calistir() {
        System.out.println("Tır Çalıştı");
    }

    @Override
    public void ilerle() {
        System.out.println("Tır İlerliyor");
    }

    @Override
    public void durdur() {
        System.out.println("Tır durdu.");
    }
}

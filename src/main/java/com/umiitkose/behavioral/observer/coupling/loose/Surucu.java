package com.umiitkose.behavioral.observer.coupling.loose;

public class Surucu {
    Arac arac;

    public Surucu(Arac arac) {
        this.arac = arac;
    }

    public Surucu() {
    }

    public void aracSur() {
        arac.calistir();
        arac.ilerle();
    }

    public void araciDurdur() {
        arac.durdur();
    }
}

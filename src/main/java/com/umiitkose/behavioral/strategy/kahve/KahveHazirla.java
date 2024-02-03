package com.umiitkose.behavioral.strategy.kahve;

public class KahveHazirla {
    private KahveMakinesi kahveMakinesi;

    public KahveHazirla(KahveMakinesi kahveMakinesi) {
        this.kahveMakinesi = kahveMakinesi;
    }

    public void kahveHazirla() {
        kahveMakinesi.kahveHazirla();
    }
}

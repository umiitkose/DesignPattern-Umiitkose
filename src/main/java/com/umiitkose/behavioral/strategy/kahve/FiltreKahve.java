package com.umiitkose.behavioral.strategy.kahve;

public class FiltreKahve implements KahveMakinesi{

    @Override
    public void kahveHazirla() {
        System.out.println("Filtre Kahve Hazır..");
    }
}

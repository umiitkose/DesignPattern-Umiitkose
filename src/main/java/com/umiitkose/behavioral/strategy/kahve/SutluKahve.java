package com.umiitkose.behavioral.strategy.kahve;

public class SutluKahve implements KahveMakinesi {
    @Override
    public void kahveHazirla() {
        System.out.println("Sütlü kahve hazır.");
    }
}

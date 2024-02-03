package com.umiitkose.behavioral.strategy.kahve;

public class Nescafe implements KahveMakinesi {
    @Override
    public void kahveHazirla() {
        System.out.println("Nescafe 3-1 arada hazır :)");
    }
}

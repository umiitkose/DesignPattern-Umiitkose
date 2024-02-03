package com.umiitkose.behavioral.strategy.kahve;
/** https://umiitkose.com */
public class Expresso implements KahveMakinesi {
    @Override
    public void kahveHazirla() {
        System.out.println("Expresso hazır");
    }
}

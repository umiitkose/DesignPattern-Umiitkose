package com.umiitkose.behavioral.chain_of_responsibility.atm;

public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

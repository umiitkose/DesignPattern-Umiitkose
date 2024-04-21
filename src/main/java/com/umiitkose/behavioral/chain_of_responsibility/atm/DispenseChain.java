package com.umiitkose.behavioral.chain_of_responsibility.atm;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);

}

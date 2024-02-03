package com.umiitkose.behavioral.strategy.math;

public class OperationContext {

    private Strategy strategy;

    public OperationContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doOperation(int a1, int a2) {

        return strategy.doOperation(a1, a2);
    }
}

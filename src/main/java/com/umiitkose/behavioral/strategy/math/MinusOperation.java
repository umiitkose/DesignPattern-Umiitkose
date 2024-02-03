package com.umiitkose.behavioral.strategy.math;

public class MinusOperation implements Strategy {
    @Override
    public int doOperation(int a1, int a2) {

        return a1 - a2;
    }
}

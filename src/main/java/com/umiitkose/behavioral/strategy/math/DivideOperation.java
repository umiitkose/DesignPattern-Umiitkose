package com.umiitkose.behavioral.strategy.math;

public class DivideOperation implements Strategy {
    @Override
    public int doOperation(int a1, int a2) {
        if (a2 == 0)
            new ArithmeticException("2. sayı 0 olmamalıdır.");
        return a1 / a2;
    }
}

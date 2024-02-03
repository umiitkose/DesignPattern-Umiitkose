package com.umiitkose.behavioral.strategy.math;

public class Main {

    public static void main(String[] args) {

        OperationContext operationContext = new OperationContext(new AddOperation());
        System.out.println(operationContext.doOperation(5, 10));


    }
}

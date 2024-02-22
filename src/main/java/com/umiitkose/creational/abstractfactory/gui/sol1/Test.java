package com.umiitkose.creational.abstractfactory.gui.sol1;


public class Test {
    public static void main(String[] args) {
        new Client(new ButtonFactory());
        new Client(new ListFactory());
    }
}


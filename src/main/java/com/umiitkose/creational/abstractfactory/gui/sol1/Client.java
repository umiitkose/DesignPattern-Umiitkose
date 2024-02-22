package com.umiitkose.creational.abstractfactory.gui.sol1;

public class Client {
    public Client(GUIFactory factory){
        Component component = factory.create();
        component.paint();
    }
}
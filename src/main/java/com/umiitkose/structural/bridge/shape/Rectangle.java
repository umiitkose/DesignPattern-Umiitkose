package com.umiitkose.structural.bridge.shape;

public class Rectangle extends Shape{

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.println("Filling " + this.getClass());
        color.fillColor();
    }
}

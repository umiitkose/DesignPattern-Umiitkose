package com.umiitkose.structural.bridge.shape;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.println("Filling " + this.getClass());
        color.fillColor();
    }
}

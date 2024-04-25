package com.umiitkose.structural.bridge.shape;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void fillColor();
}

package com.umiitkose.structural.bridge.shape;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        circle.fillColor();

        Shape square = new Rectangle(new BlueColor());
        square.fillColor();
    }



}

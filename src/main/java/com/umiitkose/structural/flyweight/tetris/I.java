package com.umiitkose.structural.flyweight.tetris;

public class I implements Piece {

    private String label;

    public I() {
        label = "I";
    }

    @Override
    public void create(String color, int speed, boolean irreversible) {
        System.out.println("Piece is " + label + ", color" + color + ", speed: " + speed + ", irreversible: " + irreversible);
    }
}

package com.umiitkose.creational.factory.samsung;

public abstract class Note {

    private String model;
    private int yil;

    public Note(String model, int yil) {
        this.model = model;
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Note{" +
                "model='" + model + '\'' +
                ", yil=" + yil +
                '}';
    }
}

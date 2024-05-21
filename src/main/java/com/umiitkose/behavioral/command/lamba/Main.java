package com.umiitkose.behavioral.command.lamba;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        Kumanda kumanda=new Kumanda();

        kumanda.setCommand(new LambaAcCommand(light));
        kumanda.pressButton();

        kumanda.setCommand(new LambaKapatCommand(light));
        kumanda.pressButton();

        kumanda.pressUndoButton();


    }
}

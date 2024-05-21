package com.umiitkose.behavioral.command.lamba;

public class Kumanda {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
    public void pressUndoButton() {
        command.undo();
    }
}

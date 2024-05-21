package com.umiitkose.behavioral.command.lamba;

public class LambaAcCommand implements Command {
    Light light;

    public LambaAcCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

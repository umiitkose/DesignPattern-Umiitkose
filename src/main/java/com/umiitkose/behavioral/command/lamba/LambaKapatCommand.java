package com.umiitkose.behavioral.command.lamba;

public class LambaKapatCommand implements Command {
    Light light;

    public LambaKapatCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

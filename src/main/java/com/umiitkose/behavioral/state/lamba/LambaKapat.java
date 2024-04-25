package com.umiitkose.behavioral.state.lamba;

public class LambaKapat implements LambaState{

    LambaContext lambaContext;

    public LambaKapat(LambaContext lambaContext) {
        this.lambaContext = lambaContext;
    }

    @Override
    public void on() {
        lambaContext.setLambaState(lambaContext.getLambaAc());
        System.out.println("Lamba açıldı");
    }

    @Override
    public void off() {
        System.out.println("Lamba zaten kapalı");
    }
}

package com.umiitkose.behavioral.state.lamba;

public class LambaAc implements LambaState {

    LambaContext lambaContext;

    public LambaAc(LambaContext lambaContext) {
        this.lambaContext = lambaContext;
    }

    @Override
    public void on() {
        System.out.println("Lamba zaten açık");
    }

    @Override
    public void off() {
        lambaContext.setLambaState(lambaContext.getLambaKapat());
        System.out.println("Lamba Kapatıldı.");
    }
}

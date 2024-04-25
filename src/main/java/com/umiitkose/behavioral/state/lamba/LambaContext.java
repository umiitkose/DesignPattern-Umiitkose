package com.umiitkose.behavioral.state.lamba;

public class LambaContext {

    private LambaState lambaState;
    private LambaAc lambaAc;
    private LambaKapat lambaKapat;

    public LambaContext() {
        lambaAc = new LambaAc(this);
        lambaKapat = new LambaKapat(this);
        lambaState = lambaKapat;
        System.out.println("Lamba Kapalı olarak başladı.");
    }

    public void start() {
        lambaState.on();
    }

    public void close() {
        lambaState.off();
    }

    public void setLambaState(LambaState lambaState) {
        this.lambaState = lambaState;
    }

    public LambaState getLambaState() {
        return lambaState;
    }

    public LambaAc getLambaAc() {
        return lambaAc;
    }

    public LambaKapat getLambaKapat() {
        return lambaKapat;
    }
}

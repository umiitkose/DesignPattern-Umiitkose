package com.umiitkose.behavioral.state.engine;

public class Engine {

    private EngineOffState engineOffState;
    private EngineOnState engineOnState;
    private State state;

    public Engine() {
        engineOffState = new EngineOffState(this);
        engineOnState = new EngineOnState(this);
        state = engineOffState;
        System.out.println("Motor Kapalı");
    }

    public void start() {
        state.on(this);
    }

    public void stop() {
        state.off(this);
    }

    public EngineOffState getEngineOffState() {
        return engineOffState;
    }

    public void setEngineOffState(EngineOffState engineOffState) {
        this.engineOffState = engineOffState;
    }

    public EngineOnState getEngineOnState() {
        return engineOnState;
    }

    public void setEngineOnState(EngineOnState engineOnState) {
        this.engineOnState = engineOnState;
    }

    public void setState(State state) {
        this.state = state;
    }
}

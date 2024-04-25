package com.umiitkose.behavioral.state.engine;

public class EngineOffState implements State {
    Engine engine;

    public EngineOffState(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void on(Engine engine) {
        engine.setState(engine.getEngineOnState());
        System.out.println("Motor Çalıştı.");
    }

    @Override
    public void off(Engine engine) {
        System.out.println("Motor kapalı durumda!");
    }
}

package com.umiitkose.behavioral.state.engine;

public class EngineOnState implements State {
    Engine engine;

    public EngineOnState(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void off(final Engine engine) {
        engine.setState(engine.getEngineOffState());
        System.out.println("Motor durduruldu...");
    }

    @Override
    public void on(final Engine engine) {
        System.out.println("Motor çalışır durumda!");
    }
}

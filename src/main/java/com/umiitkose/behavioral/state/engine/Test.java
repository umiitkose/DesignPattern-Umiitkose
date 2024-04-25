package com.umiitkose.behavioral.state.engine;

public class Test {
    public static void main(final String[] args) {
        final Engine engine = new Engine();
        engine.stop();
        engine.start();
        engine.start();
    }
}

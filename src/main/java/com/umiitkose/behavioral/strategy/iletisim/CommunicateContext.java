package com.umiitkose.behavioral.strategy.iletisim;

public class CommunicateContext {

    private Communicate communicate;

    public CommunicateContext(Communicate communicate) {
        this.communicate = communicate;
    }

    public void gonder() {
        communicate.send();
    }
}

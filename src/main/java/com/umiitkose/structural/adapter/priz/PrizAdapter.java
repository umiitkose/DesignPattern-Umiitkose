package com.umiitkose.structural.adapter.priz;

public class PrizAdapter implements IYurtdisiPriz {

    ITurkiyePriz turkiyePriz;

    public PrizAdapter(ITurkiyePriz turkiyePriz) {
        this.turkiyePriz = turkiyePriz;
    }

    @Override
    public void priz() {
        turkiyePriz.turkiyePriz();
    }
}

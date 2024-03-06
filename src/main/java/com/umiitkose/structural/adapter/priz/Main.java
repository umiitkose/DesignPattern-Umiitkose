package com.umiitkose.structural.adapter.priz;

public class Main {
    public static void main(String[] args) {

        TurkiyePriz turkiyePriz = new TurkiyePriz();
        turkiyePriz.turkiyePriz();
        YurtdisiPriz yurtdisiPriz = new YurtdisiPriz();
        yurtdisiPriz.priz();

        IYurtdisiPriz prizAdapter = new PrizAdapter(turkiyePriz);
        prizAdapter.priz();
    }
}

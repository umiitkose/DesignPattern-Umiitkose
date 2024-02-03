package com.umiitkose.behavioral.strategy.iletisim;

public class SMS implements Communicate{
    @Override
    public void send() {
        System.out.println("sms gönderiliyor..");
    }
}

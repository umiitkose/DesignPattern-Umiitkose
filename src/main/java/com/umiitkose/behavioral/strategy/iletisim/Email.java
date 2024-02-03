package com.umiitkose.behavioral.strategy.iletisim;

import java.util.Set;

public class Email implements Communicate{
    @Override
    public void send() {
        System.out.println("Email Gönderiliyor.");

    }
}

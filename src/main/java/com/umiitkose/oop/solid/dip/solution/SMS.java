package com.umiitkose.oop.solid.dip.solution;

public class SMS implements Message {

    public void sendSMS() {
        sendMessage();
    }

    @Override
    public void sendMessage() {
        System.out.println("Send SMS");
    }
}

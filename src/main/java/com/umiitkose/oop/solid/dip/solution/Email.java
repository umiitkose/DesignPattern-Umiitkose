package com.umiitkose.oop.solid.dip.solution;

public class Email implements Message {

    public void sendEmail() {
        sendMessage();
    }

    @Override
    public void sendMessage() {
        System.out.println("Send Email");
    }
}

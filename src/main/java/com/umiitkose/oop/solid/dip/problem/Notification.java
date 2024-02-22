package com.umiitkose.oop.solid.dip.problem;

public class Notification {

    Email email;
    SMS sms;

    public Notification() {
        email = new Email();
        sms = new SMS();
    }

    public void sendMessage() {
        sms.sendSMS();
        email.sendEmail();
    }
}

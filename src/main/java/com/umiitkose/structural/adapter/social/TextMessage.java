package com.umiitkose.structural.adapter.social;

public class TextMessage implements Text {
    @Override
    public String textMessage() {
        return "Text Message";
    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data + " olarak paylaşıldı.");
    }
}

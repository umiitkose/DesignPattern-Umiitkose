package com.umiitkose.structural.adapter.social;

public class Adapter implements Text{

    private String message;
    private Voice voice;

    public Adapter(Voice voice) {
        this.voice = voice;
    }

    @Override
    public String textMessage() {
        return voice.voiceMessage() + " Text metne dönüştürüldü. Text Metin";

    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data + " olarak paylaşıldı.");
    }
}

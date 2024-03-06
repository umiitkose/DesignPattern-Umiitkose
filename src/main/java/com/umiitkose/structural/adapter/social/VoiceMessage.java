package com.umiitkose.structural.adapter.social;

public class VoiceMessage implements Voice {

    @Override
    public String voiceMessage() {
        return "Voice Message";
    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data +" olarak paylaşıldı");
    }
}

package com.umiitkose.structural.adapter.social;

public class Main {
    public static void main(String[] args) {
        Voice voice = new VoiceMessage();
        voice.shareMessage(voice.voiceMessage());

        Text text = new TextMessage();
        text.shareMessage(text.textMessage());

        Text adapter = new Adapter(voice);
        adapter.shareMessage(adapter.textMessage());

    }
}

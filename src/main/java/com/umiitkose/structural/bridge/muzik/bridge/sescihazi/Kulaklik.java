package com.umiitkose.structural.bridge.muzik.bridge.sescihazi;

public class Kulaklik implements SesCihaz{
    @Override
    public void sesiCal(String ses) {
        System.out.println("Kulaklık " + ses + " çalıyor.");
    }
}

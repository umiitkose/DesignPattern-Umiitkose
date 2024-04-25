package com.umiitkose.structural.bridge.muzik.bridge.cihaz;


import com.umiitkose.structural.bridge.muzik.bridge.Muzik;
import com.umiitkose.structural.bridge.muzik.bridge.muzikcalar.MuzikCalar;
import com.umiitkose.structural.bridge.muzik.bridge.sescihazi.SesCihaz;

public class Telefon extends MuzikCalabilenBilgisayar {

    public Telefon(SesCihaz sesCihaz, MuzikCalar muzikCalar) {
        super(sesCihaz,muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon Müzik Çalıyor ");
        super.muzikCal(muzik);
    }
}

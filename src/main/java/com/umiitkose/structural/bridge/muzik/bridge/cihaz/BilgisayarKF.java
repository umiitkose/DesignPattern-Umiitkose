package com.umiitkose.structural.bridge.muzik.bridge.cihaz;


import com.umiitkose.structural.bridge.muzik.bridge.Muzik;
import com.umiitkose.structural.bridge.muzik.bridge.muzikcalar.Fizy;
import com.umiitkose.structural.bridge.muzik.bridge.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {
    public BilgisayarKF() {
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar Çalıştı");
        super.muzikCal(muzik);
    }
}

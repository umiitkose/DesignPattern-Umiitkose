package com.umiitkose.structural.bridge.muzik.bridge.cihaz;


import com.umiitkose.structural.bridge.muzik.bridge.Muzik;
import com.umiitkose.structural.bridge.muzik.bridge.muzikcalar.MuzikCalar;
import com.umiitkose.structural.bridge.muzik.bridge.sescihazi.SesCihaz;

public abstract class MuzikCalabilenBilgisayar {

    protected SesCihaz sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihaz sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

   void muzikCal(Muzik muzik) {
        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);

    }
}

package com.umiitkose.structural.bridge.muzik.bridge.muzikcalar;


import com.umiitkose.structural.bridge.muzik.bridge.Muzik;

public class Fizy implements MuzikCalar {
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy" + muzik.getAdi() + "şarkısını çalıyor.");
        return muzik.getSes();
    }
}

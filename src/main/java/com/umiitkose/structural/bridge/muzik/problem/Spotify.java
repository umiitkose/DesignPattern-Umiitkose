package com.umiitkose.structural.bridge.muzik.problem;

public class Spotify {

    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " şarkısını çalıyor.");
        return muzik.getSes();
    }
}

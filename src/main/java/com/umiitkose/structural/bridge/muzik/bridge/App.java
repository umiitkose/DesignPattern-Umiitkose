package com.umiitkose.structural.bridge.muzik.bridge;


import com.umiitkose.structural.bridge.muzik.bridge.cihaz.BilgisayarKF;
import com.umiitkose.structural.bridge.muzik.bridge.cihaz.Telefon;
import com.umiitkose.structural.bridge.muzik.bridge.muzikcalar.Fizy;
import com.umiitkose.structural.bridge.muzik.bridge.sescihazi.Kulaklik;

public class App {

    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse Hadi Gülümse");

        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);
    }
}

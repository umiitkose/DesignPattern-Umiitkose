package com.umiitkose.behavioral.mediator.ucus;

public class IstanbulKule implements Kule {
    public void ucakEkle(Ucak ucak) {
        ucaklar.add(ucak);
    }

    public void ucakCikar(Ucak ucak) {
        ucaklar.remove(ucak);
    }

    public void haberVer(Ucak ucak, String mesaj) {
        ucak.haberAl(mesaj);
    }
}

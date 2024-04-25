package com.umiitkose.behavioral.mediator.ucus;

import java.util.ArrayList;

interface Kule {
    ArrayList<Ucak> ucaklar = null;
    public void ucakEkle(Ucak ucak);
    public void ucakCikar(Ucak ucak);
    public void haberVer(Ucak ucak, String mesaj);

}

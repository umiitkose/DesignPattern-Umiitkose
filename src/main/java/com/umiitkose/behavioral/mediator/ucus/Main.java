package com.umiitkose.behavioral.mediator.ucus;

public class Main {
    public static void main(String[] args) {
        UcakModel1 ucak1 = new UcakModel1();
        Ucak ucak2 = new UcakModel2();
        ucak1.kule.haberVer(ucak2, "Pisti kullanıyorum");
    }
}

package com.umiitkose.behavioral.mediator.ucus;

public class UcakModel1 implements Ucak {
    public Kule kule = new IstanbulKule();

    public void haberAl (String mesaj) {
        System.out.println("UcakModel1 Haber alındı." + mesaj);
    }

}

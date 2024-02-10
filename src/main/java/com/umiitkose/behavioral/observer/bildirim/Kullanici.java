package com.umiitkose.behavioral.observer.bildirim;

public class Kullanici implements Abone {

    private String kullanici;

    public Kullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    @Override
    public void mesajAl(String mesaj) {
        System.out.println(kullanici + " mesaj aldı. Alınan Mesaj : " + mesaj);
    }

}

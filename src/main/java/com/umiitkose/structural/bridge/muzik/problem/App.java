package com.umiitkose.structural.bridge.muzik.problem;

public class App {
    public static void main(String[] args) {

        /* Burada problem bilgisayar 'da kulaklık girişide var ve kulaklıktan müzik dinlemek istersem, spotify yerine
        * fizy 'den dinlemek istersem ne olacak ? Sorun burada başlıyor. bridge kısmında çözüyoruz.
        * */

        Muzik muzik = new Muzik("Sezen Aksu - Gulumse", "Gülümse hadi Gülümse");

        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.muzikCal(muzik);
    }
}

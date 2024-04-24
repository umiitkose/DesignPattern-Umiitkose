package com.umiitkose.creational.prototype.person;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        Iletisim iletisim = new Iletisim("-", "-");
        Kisi kisi = new Kisi("-", "-", 0, iletisim);
        long end = System.currentTimeMillis();
        System.out.println(kisi);
        sureHesapla(now, end);
        System.out.println("-------------------");
        long nowUmit = System.currentTimeMillis();
        Iletisim iletisimUmit = new Iletisim("55", "umiitkose@gmail.com");
        Kisi umit = new Kisi("Ümit", "KÖSE", 31, iletisimUmit);
        long endUmit = System.currentTimeMillis();
        System.out.println(umit);
        sureHesapla(nowUmit, endUmit);
        System.out.println("-------------------");
        long nowOrhan = System.currentTimeMillis();

        Kisi kisiOrhan;
        Iletisim iletisimOrhan;
        try {
            kisiOrhan = kisi.clone();
            iletisimOrhan = iletisim.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        kisiOrhan.setAd("Orhan");
        kisiOrhan.setSoyad("KÖSE");
        kisiOrhan.setYas(60);
        iletisimOrhan.setEmail("orhankose");
        iletisimOrhan.setCeptel("22");
        kisiOrhan.setIletisim(iletisimOrhan);
        iletisim.setCeptel("5");
        System.out.println(kisiOrhan);
        long endOrhan = System.currentTimeMillis();
        sureHesapla(nowOrhan,endOrhan);


    }

    private static void sureHesapla(Long now, Long end) {
        System.out.println("Geçen Süre " + ((end - now) / 1000) + " sn'dir.");
    }
}

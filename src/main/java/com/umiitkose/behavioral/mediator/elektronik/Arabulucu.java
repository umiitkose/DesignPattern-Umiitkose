package com.umiitkose.behavioral.mediator.elektronik;

public class Arabulucu {

    private Bilgisayar  bilgisayar;
    private Televizyon  televizyon;
    private Radyo    radyo;

    public void bilgisayarEkle( final Bilgisayar bilgisayar ) {
        this.bilgisayar = bilgisayar;
    }

    public void radyoEkle( final Radyo radyo ) {
        this.radyo = radyo;
    }

    public void televizyonEkle( final Televizyon televizyon ) {
        this.televizyon = televizyon;
    }

    public void bilgisayarCalistir() {
        // Bilgisayar çalıştığında, diğer aygıtların durması isteniyor.
        televizyon.durdur();
        radyo.durdur();
    }

    public void radyoCalistir() {
        // Radyo çalıştığında, diğer aygıtların durması isteniyor.
        bilgisayar.durdur();
        televizyon.durdur();
    }

    public void televizyonCalistir() {
        // Televizyon çalıştığında, diğer aygıtların durması isteniyor.
        bilgisayar.durdur();
        radyo.durdur();
    }
}

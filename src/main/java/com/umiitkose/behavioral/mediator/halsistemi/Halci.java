package com.umiitkose.behavioral.mediator.halsistemi;

import java.math.BigDecimal;

public abstract class Halci {
    private String adi;
    private UrunEnum urun;
    private BigDecimal fiyat;

    private Mediator araci;

    public Halci(String adi, UrunEnum urun, BigDecimal fiyat, Mediator araci) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }

    public String getAdi() {
        return adi;
    }

    public UrunEnum getUrun() {
        return urun;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }
}
